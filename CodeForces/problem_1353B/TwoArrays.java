import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numOfCases = Integer.parseInt(input.nextLine());

        for(int i = 0; i < numOfCases; i++){
            int num = input.nextInt();
            int moves = input.nextInt();
            input.nextLine();

            int[] firstArr = new int[num];
            int[] secondArr = new int[num];

            for (int j = 0; j < num; j++) {
                firstArr[j] = input.nextInt();
            }
            input.nextLine(); // Consume the rest of the line
            for (int j = 0; j < num; j++) {
                secondArr[j] = input.nextInt();
            }
            input.nextLine();

            Arrays.sort(firstArr);
            Arrays.sort(secondArr);

            for(int j = 0; j < moves; j++){
                if(firstArr[j] < secondArr[num-j-1]){
                    int temp = firstArr[j];
                    firstArr[j] = secondArr[num-j-1];
                    secondArr[num-j-1] = temp;
                }
            }

            int sum = 0;
            for(int j = 0; j < num; j++){
                sum += firstArr[j];
            }

            System.out.println(sum);
        }
        input.close();
    }
}
