import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int numOfLines = N * 2 + 1;
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < N; i++) {
            buffer.append(" ".repeat(N)).append("*\n");
        }
        buffer.append("*".repeat(numOfLines)).append('\n');
        for (int i = 0; i < N; i++) {
            buffer.append(" ".repeat(N)).append("*\n");
        }
        String output = buffer.toString();
        System.out.print(output);
    }
}