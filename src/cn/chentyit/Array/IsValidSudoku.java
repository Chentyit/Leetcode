package cn.chentyit.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/10 21:49
 * @Version 1.0
 */
public class IsValidSudoku {

    private static boolean isValidSudoku(char[][] board) {
        Set<Character> row = new HashSet<>();
        Set<Character> col = new HashSet<>();
        Set<Character> block = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int m = i / 3 * 3 + j / 3;
                int n = i % 3 * 3 + j % 3;
                if (
                        (board[i][j] != '.' && !row.add(board[i][j])) ||
                        (board[j][i] != '.' && !col.add(board[j][i])) ||
                        (board[m][n] != '.' && !block.add(board[m][n]))
                ) {
                    return false;
                }
            }
            row.clear();
            col.clear();
            block.clear();
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][] {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }
}
