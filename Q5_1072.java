import java.util.Scanner;
 
public class Q5_1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int k = 1; k <= n; k++) {
            long count = calculateKnightPlacements(k);
            System.out.println(count);
        }
    }

    public static long calculateKnightPlacements(int k) {
        return (long) k * k * (k * k - 1) / 2 - 4 * (k - 1) * (k - 2);
    }
}
