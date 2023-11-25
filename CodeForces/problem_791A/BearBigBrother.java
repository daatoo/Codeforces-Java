import java.util.Scanner;

public class BearBigBrother {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String years = input.nextLine();
        Scanner line = new Scanner(years);
        int LimakYear =  line.nextInt();
        int BobYear = line.nextInt();
        input.close(); line.close();
        int count = 0;
        while(LimakYear <= BobYear){
            count++;
            LimakYear *= 3;
            BobYear *= 2;
        }
        System.out.println(count);
    }
}
