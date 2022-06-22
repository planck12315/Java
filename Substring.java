import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < caseCount; i++) {
            int startPos = input.nextInt(), endPos = input.nextInt();
            input.useDelimiter("");
            char space = input.next().charAt(0);
            input.reset();
            String motherString = input.nextLine();
            if (endPos < startPos || startPos > motherString.length() - 1) {
                System.out.println(-1);
                continue;
            }
            if (endPos > motherString.length() - 1) {
                endPos = motherString.length() - 1;
            }
            System.out.println(motherString.substring(startPos, endPos + 1));
        }
    }
}