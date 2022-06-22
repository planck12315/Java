import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < caseCount; i++) {
            String line = input.nextLine();
            if (line.charAt(0) == '-') {
                line = line.substring(1, line.length());
            }
            int sum = 0;
            for (char c : line.toCharArray()) {
                sum += c - '0';
            }
            System.out.println(sum);
        }
    }
}