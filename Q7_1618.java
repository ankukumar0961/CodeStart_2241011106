import java.util.Scanner;
 
public class Q7_1618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int count = countTrailingZerosInFactorial(n);
        System.out.println(count);
    }

    public static int countTrailingZerosInFactorial(int n) {
        int count = 0;

        while (n >= 5) {
            n /= 5;
            count += n;
        }

        return count;
    }
}
//Name- Anku kumar
//Registration Number- 2241011106
//Problem Link -https://cses.fi/problemset/task/1618
