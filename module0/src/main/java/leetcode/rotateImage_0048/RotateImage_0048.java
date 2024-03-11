package leetcode.rotateImage_0048;

public class RotateImage_0048 {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-(j+1)];
                matrix[i][N-(j+1)] = temp;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N-(i+1); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[N-(j+1)][N-(i+1)];
                matrix[N-(j+1)][N-(i+1)] = temp;
            }
        }
    }

    public void rotate2(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
