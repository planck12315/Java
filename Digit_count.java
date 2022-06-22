import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        for (int i = 0; i < caseCount; i++) {
            int number = input.nextInt();
            number = Math.abs(number);
            String temp = String.valueOf(number);
            System.out.println(temp.length());
        }
    }
}