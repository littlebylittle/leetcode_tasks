package leetcode.numberOfIslands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslands_0200Test {
    @Test
    void name() {
        int result = new NumberOfIslands_0200().numIslands(new char[][] {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}});
        assertEquals(1, result);
    }

    @Test
    void name02() {
        int result = new NumberOfIslands_0200().numIslands(new char[][] {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1' }});
        assertEquals(3, result);
    }
}