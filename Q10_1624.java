import java.util.Scanner;
 
public class Q10_1624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[8][8];

        for (int i = 0; i < 8; i++) {
            String row = scanner.next();
            for (int j = 0; j < 8; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        int count = countWaysToPlaceQueens(board);
        System.out.println(count);
    }

    public static int countWaysToPlaceQueens(char[][] board) {
        int[] colPlacements = new int[8];
        return countQueenPlacements(board, 0, colPlacements);
    }

    public static int countQueenPlacements(char[][] board, int row, int[] colPlacements) {
        if (row == 8) {
            return 1;
        }

        int count = 0;

        for (int col = 0; col < 8; col++) {
            if (isValidPlacement(board, row, col, colPlacements)) {
                colPlacements[row] = col;
                count += countQueenPlacements(board, row + 1, colPlacements);
            }
        }

        return count;
    }

    public static boolean isValidPlacement(char[][] board, int row, int col, int[] colPlacements) {
        if (board[row][col] == '*') {
            return false;
        }

        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = colPlacements[prevRow];

            if (col == prevCol || Math.abs(row - prevRow) == Math.abs(col - prevCol)) {
                return false;
            }
        }

        return true;
    }
}
//Name- Anku kumar
//Registration Number- 2241011106
//Problem Link - https://cses.fi/problemset/task/1624
