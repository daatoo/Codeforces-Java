import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numOfCases = Integer.parseInt(input.nextLine());
        for(int i = 0; i < numOfCases; i++){
            String perLine = input.nextLine();
            int num = Integer.parseInt(perLine);
            ArrayList<Integer> arrayOfCases = new ArrayList<Integer>();
            String[] elements = input.nextLine().split(" ");
            for(int j = 0; j < num; j++){
                arrayOfCases.add(Integer.parseInt(elements[j]));
            }
            Collections.sort(arrayOfCases);
            int count = 0;
            for(int j = 0; j < arrayOfCases.size()-1; j++){
                if(arrayOfCases.get(j+1) - arrayOfCases.get(j) >= -1 && arrayOfCases.get(j+1) - arrayOfCases.get(j) <= 1){
                    count++;
                }
            }
            if(count + 1 == arrayOfCases.size()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        input.close();
    }
}
