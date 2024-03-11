package leetcode.setMatrixZero;

public class SetMatrixZeroes_0073 {
    public void setZeroes(int[][] matrix) {
        boolean zeroWidth = false;
        boolean zeroHeight = false;
        int height = matrix.length;
        int width = matrix[0].length;
        for (int i = 0; i < height; i++) {
            if(matrix[i][0] == 0) {
                zeroHeight = true;
            }
        }
        for (int j = 0; j < width; j++) {
            if(matrix[0][j] == 0) {
                zeroWidth = true;
            }
        }
        //sub-squre from 1-row, 1-column
        for (int i = 1; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(matrix[i][j]==0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //clearing sub-square, go through first column and clear lines
        for (int i = 1; i < height; i++) {
            if(matrix[i][0] ==0) {
                for (int j = 1; j < width; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        //clearing, go through first line and clear columns
        for (int j = 0; j < width; j++) {
            if(matrix[0][j] ==0) {
                for (int i = 1; i < height; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        //last setting 1-row, 1-colum to zero;
        if(zeroHeight) {
            for (int i = 0; i < height; i++) {
                matrix[i][0] =0;
            }
        }
        if(zeroWidth) {
            for (int j = 0; j < width; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
