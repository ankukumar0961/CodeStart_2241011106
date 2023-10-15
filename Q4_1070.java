import java.util.Scanner;
 
public class Q4_1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        } else {
            // Create two lists: even numbers and odd numbers
            StringBuilder beautifulPermutation = new StringBuilder();
            for (int i = 2; i <= n; i += 2) {
                beautifulPermutation.append(i).append(" ");
            }
            for (int i = 1; i <= n; i += 2) {
                beautifulPermutation.append(i).append(" ");
            }
            System.out.println(beautifulPermutation);
        }
    }
}//Name- Anku kumar
//Registration Number- 2241011106
//Problem Link -https://cses.fi/problemset/task/1070

