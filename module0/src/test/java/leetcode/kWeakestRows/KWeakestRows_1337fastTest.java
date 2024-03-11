package leetcode.kWeakestRows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KWeakestRows_1337fastTest {
    @Test
    void nameXXX() {
        int[] ints = new KWeakestRows_1337fast().kWeakestRows(new int[][]{{1, 2}, {3, 4}}, 2);
        assertArrayEquals(new int[] {0, 1}, ints);
    }

    @Test
    void nameX01() {
        int[] ints = new KWeakestRows_1337fast().kWeakestRows(new int[][]
                {   {1,1,0,0,0},
                    {1,1,1,1,0},
                    {1,0,0,0,0},
                    {1,1,0,0,0},
                    {1,1,1,1,1}}, 3);
        assertArrayEquals(new int[] {2, 0, 3}, ints);
    }

    @Test
    void nameX02() {
        int[] ints = new KWeakestRows_1337fast().kWeakestRows(new int[][]
                {{1,0,0,0},
                {1,1,1,1},
                {1,0,0,0},
                {1,0,0,0}}, 2);
        assertArrayEquals(new int[] {0, 2}, ints);
    }
}