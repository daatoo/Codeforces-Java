import java.util.Scanner;

public class PlusOrMinus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        short num = Short.parseShort(input.nextLine());
        for(short i = 0; i < num; i++){
            short a = input.nextShort();
            short b = input.nextShort();
            short c = input.nextShort();
            System.out.println(a + b == c ? "+" : "-");
        }
    }
}
