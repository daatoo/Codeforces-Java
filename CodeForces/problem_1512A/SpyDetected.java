import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        byte numOfCases = Byte.parseByte(input.nextLine());

        for(byte i = 0; i < numOfCases; i++){
            byte num = Byte.parseByte(input.nextLine());

            String[] stringArr = input.nextLine().split(" ");
            byte[] arr = new byte[num];
            for(byte j = 0; j < num; j++){
                arr[j] = Byte.parseByte(stringArr[j]);
            }

            byte index = findSpy(arr);

            System.out.println(index+1);
        }
    }
    public static byte findSpy(byte[] arr){
        if(arr[0] != arr[1]){
            return (byte) (arr[0] == arr[2] ? 1 : 0);
        }
        for(byte i = 2; i < arr.length; i++){
            if(arr[i] != arr[0]){
                return i;
            }
        }
        return -1;
    }
}
