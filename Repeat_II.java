import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String emptyLine = input.nextLine();
        String s = input.nextLine();
        for(int i = 0; i < num; i++) {
            System.out.println(s);
        }
    }
}