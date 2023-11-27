import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        short numOfCases = Short.parseShort(input.nextLine());
        for(short i = 0; i < numOfCases; i++){
            short num = Short.parseShort(input.nextLine());
            String[] stringArr = input.nextLine().split(" ");

            short[] arr = new short[num];
            for(short j = 0; j < num; j++){
                arr[j] = Short.parseShort(stringArr[j]);
            }

            short misplacedEven = 0, misplacedOdd = 0;
            for(short j = 0; j < num; j++){
                if (j % 2 != arr[j] % 2) {
                    if (j % 2 == 0) misplacedEven++;
                    else misplacedOdd++;
                }
            }

            System.out.println(misplacedEven != misplacedOdd ? -1 : misplacedEven);
        }
    }
}
