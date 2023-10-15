import java.util.Scanner;
 
public class Q8_2205 {
    public static void generateGrayCode(int n) {
        if (n <= 0) {
            System.out.println("0");
            return;
        }
 
        // Initialize the Gray code for n=1
        String[] grayCode = {"0", "1"};
 
        // Generate Gray code for n > 1
        for (int i = 2; i <= n; i++) {
            String[] newGrayCode = new String[(int) Math.pow(2, i)];
            int index = 0;
 
            // Append '0' to the front for the first half
            for (int j = 0; j < (1 << i - 1); j++) {
                newGrayCode[index++] = "0" + grayCode[j];
            }
 
            // Append '1' to the front for the second half in reverse order
            for (int j = (1 << i - 1) - 1; j >= 0; j--) {
                newGrayCode[index++] = "1" + grayCode[j];
            }
 
            grayCode = newGrayCode;
        }
 
        // Print the Gray code
        for (String code : grayCode) {
            System.out.println(code);
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
 
        generateGrayCode(n);
    }
}
//Name- Anku kumar
//Registration Number- 2241011106
//Problem Link -https://cses.fi/problemset/task/2205
