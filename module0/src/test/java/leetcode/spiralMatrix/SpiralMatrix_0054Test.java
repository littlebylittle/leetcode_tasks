package leetcode.spiralMatrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrix_0054Test {
    @Test
    void name01() {
        List<Integer> integers = new SpiralMatrix_0054().spiralOrder(
                new int[][]{{1, 1, 1, 1, 1, 1, 1, 1},
                        {5, 6, 6, 6, 6, 6, 6, 2},
                        {5, 9, 1, 1, 1, 1, 7, 2},
                        {5, 9, 4, 5, 5, 2, 7, 2},
                        {5, 9, 4, 6, 6, 2, 7, 2},
                        {5, 9, 3, 3, 3, 2, 7, 2},
                        {5, 8, 8, 8, 8, 8, 7, 2},
                        {4, 4, 4, 4, 4, 4, 4, 2}}
        );
        assertEquals(List.of(
                1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,4,4,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,6,6,7,7,7,7,7,8,8,8,8,8,9,9,9,9,1,1,1,1,2,2,2,3,3,3,4,4,5,5,6,6
        ), integers);
    }
}