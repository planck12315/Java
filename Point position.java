import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x0 = input.nextDouble(), y0 = input.nextDouble();
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        double discriminant = (x1 - x0) * (y2 - y0) - (y1 - y0) * (x2 - x0);
        if (discriminant > 0) {
            System.out.printf("(%.1f, %.1f) is on the left side of the line " +
                    "from (%.1f, %.1f) to (%.1f, %.1f)\n", x2, y2, x0, y0, x1, y1);
        } else if (discriminant < 0) {
            System.out.printf("(%.1f, %.1f) is on the right side of the line " +
                    "from (%.1f, %.1f) to (%.1f, %.1f)\n", x2, y2, x0, y0, x1, y1);
        } else {
            System.out.printf("(%.1f, %.1f) is on the line " +
                    "from (%.1f, %.1f) to (%.1f, %.1f)\n", x2, y2, x0, y0, x1, y1);
        }
    }
}