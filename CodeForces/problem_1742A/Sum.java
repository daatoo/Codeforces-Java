import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        for(int i = 0; i < num; i++){
            byte[] numbers = new byte[3];
            byte max = 0;
            byte sum = 0;
            for(byte j = 0; j < 3; j++){
                numbers[j] = input.nextByte();
                max = (byte) Math.max(max, numbers[j]);
                sum+= numbers[j];
            }
            System.out.println(max == 0 || (sum % max == 0 && sum / max == 2) ? "YES" : "NO");
        }
    }
}
