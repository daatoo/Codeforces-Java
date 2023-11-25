import java.util.ArrayList;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int count = 0;
        ArrayList<Character> letters = new ArrayList<Character>();
        for(int i = 0; i < name.length(); i++){
            if(!search(letters, name.charAt(i))){
                count++;
                letters.add(name.charAt(i));
            }
        }
        if(count % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
    public static boolean search(ArrayList<Character> letters, char letter){
        boolean result = false;
        for(Character element : letters){
            if(element == letter){
                result = true;
                break;
            }
        }
        return result;
    }
}
