import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < caseCount; i++) {
            int from = input.nextInt(), to = input.nextInt();
            if (from > to){
                System.out.println();
                break;
            }
            for (int j = from; j <= to; j++) {
                System.out.print(j);
                if (j % 3 == 0) {
                    System.out.print(" foo");
                }
                if (j % 5 == 0) {
                    System.out.print(" bar");
                }
                if (j % 7 == 0) {
                    System.out.print(" baz");
                }
                System.out.println();
            }
        }
    }
}