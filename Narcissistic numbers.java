import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        int numOfDigits = input.nextInt();
        int from = (int) Math.pow(10, numOfDigits - 1);
        int to = (int) Math.pow(10, numOfDigits);
        for (int i = from; i < to; i++) {
            String number = Integer.toString(i);
            int sum = 0;
            for (char c : number.toCharArray()) {
                sum += Math.pow(c - '0', numOfDigits);
            }
            if (sum == i) {
                output.append(i).append(" ");
            }
        }
        if (output.length() == 0) {
            System.out.println("No");
        } else {
            String result = output.substring(0, output.length() - 1);
            System.out.println(result);
        }
    }
}