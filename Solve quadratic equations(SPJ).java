import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("%.6f %.6f\n", r1, r2);
        } else if (discriminant == 0) {
            double r = (-b) / (2 * a);
            System.out.printf("%.6f\n", r);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}