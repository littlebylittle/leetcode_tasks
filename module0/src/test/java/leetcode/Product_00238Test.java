package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Product_00238Test {
    @Test
    void name1() {
        int[] ints = new Product_00238().productExceptSelf(new int[]{1, 2, 3});
        assertArrayEquals(new int[]{6, 3, 2}, ints);
    }
}