import java.util.Scanner;

public class Elephant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int coordinate = input.nextInt();
        input.close();
        int count = coordinate / 5;
        if(coordinate - 5 * count > 0){
            count++;
        }
        System.out.println(count);
    }
}
