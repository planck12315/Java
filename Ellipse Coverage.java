import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get test cases.
        String str = input.nextLine();
        int t = Integer.parseInt(str);
        final int BOUNDARY = 200;
        while (t-- > 0) {
            int x1 = input.nextInt(), y1 = input.nextInt();
            int x2 = input.nextInt(), y2 = input.nextInt();
            int d = input.nextInt();
            int count = 0;
            for (int x = -BOUNDARY; x <= BOUNDARY; x++) {
                for (int y = -BOUNDARY; y <= BOUNDARY; y++) {
                    double distance1 = Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
                    double distance2 = Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
                    if (distance1 + distance2 < d) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}