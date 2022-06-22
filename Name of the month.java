import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        input.nextLine();
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Jan");
        hashMap.put(2, "Feb");
        hashMap.put(3, "Mar");
        hashMap.put(4, "Apr");
        hashMap.put(5, "May");
        hashMap.put(6, "Jun");
        hashMap.put(7, "Jul");
        hashMap.put(8, "Aug");
        hashMap.put(9, "Sep");
        hashMap.put(10, "Oct");
        hashMap.put(11, "Nov");
        hashMap.put(12, "Dec");
        for (int i = 0; i < caseCount; i++) {
            int month = input.nextInt();
            System.out.println(hashMap.getOrDefault(month, "Invalid"));
        }
    }
}