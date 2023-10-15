import java.util.Scanner;
import java.util.TreeSet;
 
public class Q9_1622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
 
        TreeSet<String> results = new TreeSet<>();
        generateAllStrings("", input, results);
 
        System.out.println(results.size());
        for (String result : results) {
            System.out.println(result);
        }
    }
 
    public static void generateAllStrings(String current, String remaining, TreeSet<String> results) {
        if (remaining.isEmpty()) {
            results.add(current);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                String newCurrent = current + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                generateAllStrings(newCurrent, newRemaining, results);
            }
        }
    }
}
//Name- Anku kumar
//Registration Number- 2241011106
//Problem Link -https://cses.fi/problemset/task/1622
