import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get test cases.
        String str = input.nextLine();
        int t = Integer.parseInt(str);
        while (t-- > 0) {
            String productName = input.next();
            int productPrice = input.nextInt();
            int numOfFoodProduct = input.nextInt();
            Set<String> set = new LinkedHashSet<>();
            while (numOfFoodProduct-- > 0) {
                set.add(input.next());
            }
            double valueAddedTax = 0;
            if (set.contains(productName)) {
                valueAddedTax = productPrice * 1.1;
            } else {
                valueAddedTax = productPrice * 1.18;
            }
            System.out.printf("%.2f\n", valueAddedTax);
        }
    }
}