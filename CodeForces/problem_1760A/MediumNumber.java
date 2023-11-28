import java.util.Scanner;

public class MediumNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());

        for(int i = 0; i < num; i++){
            byte a = input.nextByte();
            byte b = input.nextByte();
            byte c = input.nextByte();

            byte median;
            if((a > b && c > a) || (a > c && b > a)){
                median = a;
            }else if((b > a && c > b) || (b > c && a > b)){
                median = b;
            }else{
                median = c;
            }

            System.out.println(median);
        }
    }
}
