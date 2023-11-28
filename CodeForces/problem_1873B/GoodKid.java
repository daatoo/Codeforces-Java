import java.util.Scanner;

public class GoodKid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numOfCases = Integer.parseInt(input.nextLine());

        for(int i = 0; i < numOfCases; i++){
            int num = Integer.parseInt(input.nextLine());

            int[] arr = new int[num];
            for(int j = 0; j < num; j++){
                arr[j] = input.nextInt();
            }
            input.nextLine();

            int min = 0;
            for(int j = 1; j < num; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            arr[min] = arr[min] + 1;

            int result = 1;
            for(int j = 0; j < num; j++){
                result *= arr[j];
            }

            System.out.println(result);
        }
        input.close();
    }
}
