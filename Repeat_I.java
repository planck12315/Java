import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        String emptyLine = input.nextLine();
        String s = input.nextLine();
        for(long i = 0; i < num; i++) {
            System.out.print(s);
        }
        System.out.println();
    }
}