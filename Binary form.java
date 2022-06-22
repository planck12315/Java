import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < caseCount; i++) {
            int decimalForm = input.nextInt();
            String binaryForm = Integer.toBinaryString(decimalForm);
            System.out.println(binaryForm);
        }
    }
}