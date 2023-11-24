import java.util.Scanner;

public class A71 {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++){
            String current;
            current = input.nextLine();
            if(current.length() > 10){
                System.out.println(current.charAt(0) +  Integer.toString(current.length()-2) + current.charAt(current.length()-1));
            }else{
                System.out.println(current);
            }
        }
    }
}
