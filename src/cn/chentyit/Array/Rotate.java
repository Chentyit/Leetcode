package cn.chentyit.Array;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/11 21:56
 * @Version 1.0
 */
public class Rotate {

    private static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int buf = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buf;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                int buf = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - j - 1];
                matrix[i][matrix[i].length - j - 1] = buf;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {16, 7, 10, 11},
        };
        rotate(matrix);
    }
}
