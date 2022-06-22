import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < caseCount; i++) {
            double fahrenheit = input.nextDouble();
            double celsius = 5 * (fahrenheit - 32) / 9;
            System.out.printf("%.2f\n", celsius);
        }
    }
}