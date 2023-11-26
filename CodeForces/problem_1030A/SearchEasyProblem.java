import java.util.Scanner;

public class SearchEasyProblem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        String secondLine = input.nextLine();
        Scanner second = new Scanner(secondLine);
        String answer = "EASY";
        for(int i = 0; i < num; i++){
            if(second.nextShort() == 1){
                answer = "HARD";
                break;
            }
        }
        System.out.println(answer);
    }
}
