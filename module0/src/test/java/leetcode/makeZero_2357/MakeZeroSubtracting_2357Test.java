package leetcode.makeZero_2357;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeZeroSubtracting_2357Test {
    @Test
    void namexxxxx() {
        int i = new MakeZeroSubtracting_2357().minimumOperations(new int[]{1, 5, 0, 3, 5});
        assertEquals(3, i);
    }

    @Test
    void name0() {
        int i = new MakeZeroSubtracting_2357().minimumOperations(new int[]{0});
        assertEquals(0, i);
    }
}