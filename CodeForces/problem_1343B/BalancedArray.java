import java.util.Arrays;
import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numOfCases = Integer.parseInt(input.nextLine());
        for(int i = 0; i < numOfCases; i++){
            int num = Integer.parseInt(input.nextLine());
            if(num % 4 != 0){
                System.out.println("NO");
            }else{
                int[] arr = new int[num];
                int first = 2;
                int sum = 0;
                for(int j = 0; j < num/2; j++){
                    arr[j] = first;
                    sum += first;
                    first+=2;
                }
                int second = 1;
                for(int j = num/2; j < num-2; j++){
                    arr[j] = second;
                    sum -= second;
                    second += 2;
                }
                if(sum % 4 == 0){
                    arr[num-2] = sum / 2 - 1;
                    arr[num-1] = sum / 2 + 1;
                }else{
                    arr[num-2] = sum / 2 - 2;
                    arr[num-1] = sum / 2 + 2;
                }
                System.out.println("YES");
                System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));
            }
        }
    }
}
