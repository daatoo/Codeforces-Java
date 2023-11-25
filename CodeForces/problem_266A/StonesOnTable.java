import java.util.Scanner;

public class StonesOnTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int NumOfColors = Integer.parseInt(input.nextLine());
        String colors = input.nextLine();
        char last = colors.charAt(0);
        int count = 0;
        for(int i = 1; i < NumOfColors; i++){
            if(last == colors.charAt(i)){
                count++;
            }else{
                last = colors.charAt(i);
            }
        }
        System.out.println(count);
    }
}
