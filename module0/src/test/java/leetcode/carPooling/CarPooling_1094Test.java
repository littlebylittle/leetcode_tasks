package leetcode.carPooling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarPooling_1094Test {
    @Test
    void name() {
        boolean b = new CarPooling_1094().carPooling(new int[][]{{3, 1, 5}, {0, 1, 3}, {2, 3, 7}, {1, 3, 9}}, 4);
        assertFalse(b);
    }
}