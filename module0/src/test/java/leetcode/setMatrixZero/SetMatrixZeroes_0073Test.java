package leetcode.setMatrixZero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZeroes_0073Test {
    @Test
    void name() {

        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        new SetMatrixZeroes_0073().setZeroes(matrix);
        assertArrayEquals(matrix, new int[][]   {{  0,0,0,0},
                                                {   0,4,5,0},
                                                {   0,3,1,0}});
    }
}