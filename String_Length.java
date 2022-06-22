import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < caseCount; i++) {
            String line = input.nextLine();
            System.out.println(line.length());
        }
    }
}