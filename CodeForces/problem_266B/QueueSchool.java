import java.util.*;

public class QueueSchool {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] firstLine = input.nextLine().split(" ");
        int num = Integer.parseInt(firstLine[0]);
        int time = Integer.parseInt(firstLine[1]);        String positions = input.nextLine();
        char[] queue = positions.toCharArray();
        for (int t = 0; t < time; t++) {
            for (int i = 0; i < num - 1; i++) {
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    i++; // Skip the next character as it's already processed
                }
            }
        }
        StringBuilder output = new StringBuilder();
        for(char ch : queue){
            output.append(ch);
        }
        System.out.println(output);
    }
}
