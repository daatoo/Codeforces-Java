import java.util.Scanner;

public class NextRound {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String line  = input.nextLine();

        Scanner lineScanner = new Scanner(line);

        int firstNum = lineScanner.nextInt();
        int secondNum = lineScanner.nextInt();
        lineScanner.close();

        String secondLine = input.nextLine();
        Scanner SecondLineScanner = new Scanner(secondLine);
        int count = 0;
        int playersScore = 0;
        for(int i = 1; i <= firstNum; i++){
            int current = SecondLineScanner.nextInt();
            if(current > 0){
                if(i < secondNum){ // 5 5
                    count++;
                    continue;
                }else if(i == secondNum){
                    playersScore = current;
                    count++;
                    continue;
                }
                if(current == playersScore){
                    count++;
                }
            }else{
                break;
            }
        }
        SecondLineScanner.close();
        System.out.println(count);
    }
}
