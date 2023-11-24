import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char letter = Character.toUpperCase(word.charAt(0));
        char[] chars = word.toCharArray();
        chars[0] = letter;
        System.out.println(new String(chars));

    }
}
