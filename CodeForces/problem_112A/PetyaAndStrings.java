import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        first = first.toLowerCase();
        second = second.toLowerCase();
        if(first.compareTo(second) == 0){
            System.out.println(0);
        }else if(first.compareTo(second) > 0){
            System.out.println(1);
        }else{
            System.out.println(-1);
        }
    }
}
