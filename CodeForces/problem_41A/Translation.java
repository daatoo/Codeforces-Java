import java.util.Scanner;

public class Translation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String reverseWord = new StringBuilder(input.nextLine()).reverse().toString();
        String answer = word.equals(reverseWord) ? "YES" : "NO";
        System.out.println(answer);
    }
}
