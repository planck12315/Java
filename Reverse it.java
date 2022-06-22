import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        input.nextLine();
        for (int i = 0; i < caseCount; i++) {
            String originalNumber = input.nextLine();
            if (originalNumber.charAt(0) == '-') {
                if (Integer.valueOf(originalNumber.substring(1)).equals(0)) {
                    System.out.println(0);
                    break;
                }
                System.out.print('-');
                originalNumber = originalNumber.substring(1);
            }
            originalNumber = Integer.valueOf(originalNumber).toString();  // 有效数字
            StringBuilder builder = new StringBuilder(originalNumber);  // 逆置
            String reversedNumber = builder.reverse().toString();
            Integer result = Integer.valueOf(reversedNumber);
            System.out.println(result);
        }
    }
}