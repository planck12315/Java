import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get test cases.
        while (input.hasNextLine()) {
            input.useDelimiter("");
            char operator = input.next().charAt(0);
            input.reset();
            double a = input.nextDouble();
            double b = input.nextDouble();
            input.nextLine();
            double result = 0;
            switch (operator) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/': {
                    if (b == 0) {
                        System.out.println("Invalid");
                        continue;
                    }
                    result = a / b;
                    break; }
                case '%': {
                    if (b == 0) {
                        System.out.println("Invalid");
                        continue;
                    }
                    result = a % b;
                    break; }
                case '^': result = Math.pow(a, b); break;
                default: {
                    System.out.println("Invalid");
                    continue;
                }
            }
            if (Double.isNaN(result)) {
                System.out.println("Invalid");
                continue;
            }
            if (result == (int) result) {
                System.out.println((int) result);
            } else {
                System.out.println(result);
            }
        }
    }
}