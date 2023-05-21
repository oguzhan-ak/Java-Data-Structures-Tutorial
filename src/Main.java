import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String slash = "/////////////////////////////////";

        // 2D Arrays
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        System.out.println(Arrays.deepToString(board));
        System.out.println(slash);

        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';

        System.out.println(Arrays.deepToString(board));
        System.out.println(slash);

        char[][] board2 = {new char[]{'0', '-', '-'}, new char[]{'0', '-', '-'}, new char[]{'0', '-', '-'}};

        System.out.println(Arrays.deepToString(board2));
    }
}