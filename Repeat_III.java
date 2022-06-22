import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            int count = input.nextInt();
            String s = input.nextLine().substring(1);
            for (int j = 0; j < count; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}