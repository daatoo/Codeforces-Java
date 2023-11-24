import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        Scanner lineScanner = new Scanner(line);
        byte first = lineScanner.nextByte();
        byte second = lineScanner.nextByte();
        System.out.println((first*second)/2);
    }
}
