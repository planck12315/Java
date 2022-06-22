import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sign = 1;
        double sigma = 0;
        for (int i = 1; i <= num; i += 2) {
            double item = 1.0 / i;
            sigma += sign * item;
            sign *= -1;
        }
        double result = 4 * sigma;
        System.out.printf("%.6f\n", result);
    }
}