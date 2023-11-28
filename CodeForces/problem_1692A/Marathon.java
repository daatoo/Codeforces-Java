import java.util.Scanner;

public class Marathon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try {
            int numOfCases = Integer.parseInt(input.nextLine());
            for (int i = 0; i < numOfCases; i++) {
                int timur = input.nextInt();
                byte count = 0;
                for (byte j = 0; j < 3; j++) {
                    if (input.nextInt() > timur) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            input.close();
        }
    }
}
