import java.util.Scanner;

public class CandiesTwoSisters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        short num = Short.parseShort(input.nextLine());
        for(int i = 0; i < num; i++){
            int candies =Integer.parseInt(input.nextLine());
            if(candies % 2 == 0){
                System.out.println(candies / 2 -1);
            }else{
                System.out.println(candies / 2);
            }
        }
        input.close();
    }
}
