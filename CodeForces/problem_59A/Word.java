import java.util.Scanner;

public class Word {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int length = word.length();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        for(int i = 0; i < length; i++){
            if(Character.isUpperCase(word.charAt(i))){
                upperCaseCount++;
            }else{
                lowerCaseCount++;
            }
        }
        if(upperCaseCount > lowerCaseCount){
            System.out.println(word.toUpperCase());
        }else{
            System.out.println(word.toLowerCase());
        }
    }
}
