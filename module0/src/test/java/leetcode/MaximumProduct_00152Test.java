package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProduct_00152Test {

    @Test
    void name01() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{101});
        assertEquals(101, i);
    }

    @Test
    void name02() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{2, 3, -2, 4});
        assertEquals(6, i);
    }

    @Test
    void name03() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{-2, 0, -1});
        assertEquals(0, i);
    }

    @Test
    void name43() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{-2, 0, 4, 8});
        assertEquals(32, i);
    }

    @Test
    void name5() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{-2, 0, 4, 8, -1});
        assertEquals(32, i);
    }

    @Test
    void name6() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{-2, 0, 4, 8, 0, -1});
        assertEquals(32, i);
    }

    @Test
    void name7() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{-22});
        assertEquals(-22, i);
    }

    @Test
    void name8() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{-2, 0, -1});
        assertEquals(0, i);

    }

    @Test
    void name09() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{6, 3, -10, 0, 2});
        assertEquals(18, i);
    }

    @Test
    void name10() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{ 2,-5,-2,-4,3 });
        assertEquals(24, i);
    }

    @Test
    void name11() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{ 11, 2, -5, 2, -2, -4, 1000 });
        assertEquals(16000, i);
    }

    @Test
    void name12() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{ -2, 0 });
        assertEquals(0, i);
    }

    @Test
    void name13() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{ 3, -1, 4 });
        assertEquals(4, i);
    }

    @Test
    void name14() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{ 1,0,-1,2,3,-5,-2});
        assertEquals(60, i);
    }

    @Test
    void name115() {
        int i = new MaximumProduct_00152().maxProduct(new int[]{ -2,3,-4});
        assertEquals(24, i);

    }
}