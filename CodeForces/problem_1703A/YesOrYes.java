import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        short num = Short.parseShort(input.nextLine());
        for(short i = 0; i < num; i++){
            String text = input.nextLine().toLowerCase();
            System.out.println(text.equals("yes") ? "YES" : "NO");
        }
    }
}
