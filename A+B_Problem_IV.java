import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        while (input.hasNextLine()) {
            a = input.nextInt();
            b = input.nextInt();
            if (a == 0 && b == 0){
                break;
            }
            System.out.println((long)a + (long)b);
        }
    }
}