package leetcode.wordSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearch_0079Test {
    @Test
    void name() {
        boolean res = new WordSearch_0079().exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED");
        assertTrue(res);
    }

    @Test
    void test_a() {
        boolean res = new WordSearch_0079().exist(new char[][]{{'a'}}, "a");
        assertTrue(res);
    }
}