import java.util.Scanner;

public class BitA {
    public static void main(String[] args){
        int result = 0;
        int n;
        Scanner input = new Scanner(System.in);
        n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++){
            String current = input.nextLine();
            if(current.equals("++X") || current.equals("X++")){
                result++;
            }else if(current.equals("--X") || current.equals("X--")){
                result--;
            }
        }
        System.out.println(result);
    }
}
