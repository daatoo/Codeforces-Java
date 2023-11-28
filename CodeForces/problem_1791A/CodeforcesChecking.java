import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        byte num = Byte.parseByte(input.nextLine());

        for(byte i = 0; i < num; i++){
            String test = input.nextLine();
            System.out.println("codeforces".contains(test) ? "YES" : "NO");
        }
    }
}
