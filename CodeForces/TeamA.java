import java.util.Scanner;

public class TeamA {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        n = Integer.parseInt(input.nextLine());
        int count = 0;
        for(int i = 0; i < n; i++){
            String current = input.nextLine();
            int SecCount = 0;
            for(int j = 0; j < current.length(); j++){
                if(current.charAt(j) == '1'){
                    SecCount++;
                }
            }
            if(SecCount >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
