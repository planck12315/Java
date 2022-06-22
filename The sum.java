import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < caseCount; i++) {
            System.out.printf("Case %d: ", i + 1);
            long from = input.nextLong(), to = input.nextLong();
            if (from > to) {
                System.out.println();
                continue;
            }
            long sum = 0;
            for (long j = from; j <= to; j++) {
                sum += j;
            }
            System.out.println(sum);
        }
    }
}