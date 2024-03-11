package leetcode.rotateImage_0048;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class RotateImage_0048Test {
    @Test
    void name() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new RotateImage_0048().rotate(matrix);
        assertArrayEquals(new int[][] {{7,4,1},{8,5,2},{9,6,3}}, matrix,
                () -> "got: " + Arrays.deepToString(matrix));
    }

    @Test
    void name2() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new RotateImage_0048().rotate2(matrix);
        assertArrayEquals(new int[][] {{7,4,1},{8,5,2},{9,6,3}}, matrix,
                () -> "got: " + Arrays.deepToString(matrix));
    }
}