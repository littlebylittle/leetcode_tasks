package leetcode.countingBits_0338;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CountingBitsTest {
    @Test
    void name1() {
        int[] ints = new CountingBits().countBits(5);
        assertArrayEquals(new int[]{0,1,1,2,1,2}, ints);
    }

    @Test
    void name01() {
        int[] ints = new CountingBits().countBits(2);
        assertArrayEquals(new int[]{0,1,1}, ints);
    }

    @Test
    void name01a() {
        int[] ints = new CountingBits().countBits(2);
        assertArrayEquals(new int[]{0,1,1}, ints);
    }
}