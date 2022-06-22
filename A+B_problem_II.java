import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        for(long i = 0; i < num; i++) {
            long a = input.nextLong(), b = input.nextLong();
            System.out.println(a + b);
        }
    }
}