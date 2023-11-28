import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numOfCases = Integer.parseInt(input.nextLine());

        for(int i = 0; i < numOfCases; i++){
            int num = Integer.parseInt(input.nextLine());
            int ones = 0;
            int twos = 0;
            for(int j = 0; j < num; j++){
                if(input.nextInt() == 1){
                    ones++;
                }else{
                    twos++;
                }
            }
            input.nextLine();
            if(ones % 2 == 1 || (ones == 0 && twos % 2 == 1)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        input.close();
    }
}
