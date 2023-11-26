import java.util.Scanner;

public class SumRoundNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        short num = Short.parseShort(input.nextLine());
        for(short i = 0; i < num; i++){
            StringBuilder result = new StringBuilder();
            int number = Integer.parseInt(input.nextLine());
            if(number > 0 && number <= 9){
                System.out.println(1);
                result.append(number);
                System.out.println(result);
            }else{
                short count = 0;
                for(int j = 1; j <= String.valueOf(number).length(); j++){
                    int left = (number % (int) Math.pow(10, j)) / (int) Math.pow(10, j-1);
                    if(left != 0){
                        count++;
                        result.append(left);
                        result.append("0".repeat(j - 1));
                        result.append(" ");
                    }
                }
                System.out.println(count);
                System.out.println(result);
            }
        }
    }
}
