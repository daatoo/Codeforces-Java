import java.util.Scanner;

public class AnotherTwoIntegers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        for(int i = 0; i < num; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int diff = Math.abs(a-b);
            int count = diff / 10 + (diff % 10 != 0 ? 1 : 0);
            System.out.println(count);
        }
        input.close();
    }
}
