import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letters = input.nextLine().trim();
        input.close();

        // Remove '{', '}', and extra spaces, and then split by ", "
        letters = letters.replaceAll("[{}]", "").trim();
        String[] items = letters.split(", ");

        Set<String> uniqueItems = new HashSet<>();
        for (String item : items) {
            if (!item.isEmpty()) {
                uniqueItems.add(item);
            }
        }

        System.out.println(uniqueItems.size());
    }
}
