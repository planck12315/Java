import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get test cases.
        String str = input.nextLine();
        int t = Integer.parseInt(str);
        while (t-- > 0) {
            int P1 = input.nextInt();
            int P2 = input.nextInt();
            double salary = input.nextDouble();
            double hours;
            double maxNumOfP1 = P1 * 200;
            if (salary <= maxNumOfP1) {
                hours = salary / P1;
            } else {
                hours = 200 + (salary - maxNumOfP1) / P2;
            }
            System.out.printf("%.4f\n", hours);
        }
    }
}