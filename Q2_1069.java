import java.util.Scanner;
public class Q2_1069 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String dnaSequence = scanner.next();
            scanner.close();

            int n = dnaSequence.length();

            int currentCount = 1;
            int maxCount = 1;

            for (int i = 1; i < n; i++) {
                if (dnaSequence.charAt(i) == dnaSequence.charAt(i - 1)) {
                    currentCount++;
                } else {
                    currentCount = 1;
                }

                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            }

            System.out.println(maxCount);
        }
    }
