import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Scanner line = new Scanner(text);
        int first = line.nextInt();
        int second = line.nextInt();
        for(int i = 0; i < second; i++){
            if(first % 10 == 0){
                first = first / 10;
            }else{
                first--;
            }
        }
        System.out.println(first);
    }
}
