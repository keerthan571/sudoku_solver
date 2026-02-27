import java.util.Scanner;
public class SudokuSolver {
    private static final int SIZE = 9;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[SIZE][SIZE];
        System.out.println("Enter Sudoku grid (use 0 for empty cells):");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nUnsolved Sudoku:");
        printBoard(board);
        if (solve(board)) {
            System.out.println("\nSolved Sudoku:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
        sc.close();
    }
    private static boolean solve(int[][] board) {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;
                            if (solve(board))
                                return true;
                            board[row][col] = 0; // backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num)
                return false;
        }
        int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;
        for (int i = boxRowStart; i < boxRowStart + 3; i++)
            for (int j = boxColStart; j < boxColStart + 3; j++)
                if (board[i][j] == num)
                    return false;
        return true;
    }
    private static void printBoard(int[][] board) {
        for (int i = 0; i < SIZE; i++) {
            if (i % 3 == 0 && i != 0)
                System.out.println("------+-------+------");
            for (int j = 0; j < SIZE; j++) {
                if (j % 3 == 0 && j != 0)
                    System.out.print("| ");
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}