import java.util.Scanner;

public class Q1_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int xorAll = 0;
        for (int i = 1; i <= n; i++) {
            xorAll ^= i;
        }

        int xorGiven = 0;
        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            xorGiven ^= num;
        }

        int missingNumber = xorAll ^ xorGiven;
        System.out.println(missingNumber);
    }
}
//Name- Anku kumar
//Registration Number- 2241011106
//Problem Link -https://cses.fi/problemset/task/1083
