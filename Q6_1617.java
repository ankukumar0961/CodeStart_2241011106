import java.util.Scanner;
 
public class Q6_1617 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        long result = calculateBitStringsCount(n);
        System.out.println(result);
    }

    public static long calculateBitStringsCount(int n) {
        long modulo = 1000000007L;
        long count = 1;

        for (int i = 0; i < n; i++) {
            count = (count * 2) % modulo;
        }

        return count;
    }
}
//Name- Anku kumar
//Registration Number- 2241011106
//Problem Link -https://cses.fi/problemset/task/1617
