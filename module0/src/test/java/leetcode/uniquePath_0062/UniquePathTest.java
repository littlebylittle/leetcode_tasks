package leetcode.uniquePath_0062;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathTest {
    @Test
    void name01() {
        var res = new UniquePath().uniquePaths(3, 7);
        assertEquals(28 , res);

        res = new UniquePath().uniquePaths(7, 3);
        assertEquals(28 , res);
    }

    @Test
    void name02() {
        var res = new UniquePath().uniquePaths(3, 2);
        assertEquals(3 , res);

        res = new UniquePath().uniquePaths(2, 3);
        assertEquals(3 , res);
    }

}