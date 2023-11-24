import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String SumOfNums = input.nextLine();
        String[] numbers = SumOfNums.split("\\+");
        byte length = (byte) numbers.length;
        byte[] byteArray = new byte[numbers.length];
        for(byte i = 0; i < length; i++){
            byteArray[i] = Byte.parseByte(numbers[i]);
        }
        byteArray = sort(byteArray);
        StringBuilder result = new StringBuilder();
        for(byte i = 0; i < length; i++){
            result.append(byteArray[i]);
            if(i < length-1){
                result.append("+");
            }
        }
        System.out.println(result);
    }
    //selection sort
    public static byte[] sort(byte[] byteArray){
        for(byte i = 0; i < byteArray.length-1; i++){
            byte min = i;
            for(byte j = i; j < byteArray.length; j++){
                if(byteArray[min] > byteArray[j]){
                    min = j;
                }
            }
            if(min != i){
                byte temp = byteArray[i];
                byteArray[i] = byteArray[min];
                byteArray[min] = temp;
            }
        }
        return byteArray;
    }
}
