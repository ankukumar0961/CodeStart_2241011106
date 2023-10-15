import java.util.Scanner;
 
public class Q3_1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        long moves = 0;  // Initialize the number of moves

        for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) {
                // Calculate the moves needed to make array[i] greater than or equal to array[i-1]
                long diff = array[i - 1] - array[i];
                moves += diff;
                array[i] = array[i - 1];  // Update the current element
            }
        }

        System.out.println(moves);
    }
}
//Name- Anku kumar
//Registration Number- 2241011106
//Problem Link -https://cses.fi/problemset/task/1094
