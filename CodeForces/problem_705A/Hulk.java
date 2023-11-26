import java.util.Scanner;

public class Hulk {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        input.close();
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                if(i == num){
                    result.append("I love it ");
                }else{
                    result.append("I love that ");
                }
            }else{
                if(i == num){
                    result.append("I hate it ");
                }else{
                    result.append("I hate that ");
                }
            }
        }
        System.out.println(result);
    }
}
