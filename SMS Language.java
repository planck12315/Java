import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get test cases.
        String str = input.nextLine();
        int t = Integer.parseInt(str);
        while (t-- > 0) {
            String message = input.nextLine();
            message = message.replaceAll("[.,?!]", "");
            message = message.toLowerCase();
            message = message.replace("and", "&").replace("ate", "8")
                    .replace("at", "@").replace("you", "U");
            System.out.println(message);
        }
    }
}