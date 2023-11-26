import java.util.Scanner;

public class Drinks {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        String percents = input.nextLine();
        input.close();
        Scanner second = new Scanner(percents);
        short sum = 0;
        for(int i = 0; i < num; i++){
            sum += second.nextShort();
        }
        second.close();
        System.out.println((double) sum / num);

    }
}
