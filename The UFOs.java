import java.util.Scanner;
public class Main {
    static int calculateRemainder(String name) {
        int product = 1;
        for (char c : name.toCharArray()) {
            product *= c - 'A' + 1;
        }
        return product % 47;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String cometName = input.nextLine(), groupName = input.nextLine();
            if (calculateRemainder(cometName) == calculateRemainder(groupName)) {
                System.out.println("GO");
            } else {
                System.out.println("STAY");
            }
        }
    }
}