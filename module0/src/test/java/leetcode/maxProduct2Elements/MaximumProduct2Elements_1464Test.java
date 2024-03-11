package leetcode.maxProduct2Elements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProduct2Elements_1464Test {
    @Test
    void name01() {
        var result = new MaximumProduct2Elements_1464().maxProduct(new int[] {3,4,5,2, 1, 1, 1 ,1, 1});
        assertEquals(12, result );
    }

    @Test
    void name02() {
        var result = new MaximumProduct2Elements_1464().maxProduct(new int[] {6,6,6,6,6,6,6});
        assertEquals(25, result);
    }

    @Test
    void namexxx() {
        //[6, 7,  9, 9];     7->9;  6-7;
        var result = new MaximumProduct2Elements_1464().maxProduct(new int[] {6,7, 9, 9});
        assertEquals(64, result);
    }

    @Test
    void namexxxx() {
        var result = new MaximumProduct2Elements_1464().maxProduct(new int[] {6,7, 10, 9});
        assertEquals(72, result);
    }
}