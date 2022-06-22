import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            long a = input.nextLong(), b = input.nextLong();
            System.out.println(a + b);
        }
    }
}