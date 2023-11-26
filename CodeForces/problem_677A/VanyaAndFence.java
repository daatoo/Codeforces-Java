import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String firstLine = input.nextLine();
        Scanner first = new Scanner(firstLine);
        short numOfFriends = first.nextShort();
        short height = first.nextShort();
        first.close();
        String secondLine = input.nextLine();
        Scanner second = new Scanner(secondLine);
        short count = 0;
        for(short i = 0; i < numOfFriends; i++){
            if(second.nextShort() <= height){
                count++;
            }else{
                count += 2;
            }
        }
        second.close();
        System.out.println(count);
    }
}
