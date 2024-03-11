package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Subarray_00053Test {
    @Test
    void name() {
        int i = new Subarray_00053().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        assertEquals(6, i);
    }

    @Test
    void name_2() {
        int i = new Subarray_00053().maxSubArray(new int[]{1});
        assertEquals(1, i);
    }

    @Test
    void name_3() {
        int i = new Subarray_00053().maxSubArray(new int[]{-6,-2});
        assertEquals(-2, i);
    }


    @Test
    void name_4() {
        int i = new Subarray_00053().maxSubArray(new int[]{5,4,-1,7,8});
        assertEquals(23, i);

    }
}
