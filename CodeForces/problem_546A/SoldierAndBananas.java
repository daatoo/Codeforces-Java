import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Scanner line = new Scanner(text);
        int price = line.nextInt();
        int dollars = line.nextInt();
        int bananas = line.nextInt();
        int sum = 0;
        for(int i = 1; i <= bananas; i++){
            sum += i*price;
        }
        if(sum<=dollars){
            System.out.println(0);
        }else{
            System.out.println(sum-dollars);
        }
    }
}
