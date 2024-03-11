package leetcode.longestIncreasingSubsequence_0300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubsequence_0300Test {
    @Test
    void test001() {
        int i = new LongestSubsequence_0300().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        assertEquals(4, i);
    }

    @Test
    void test002() {
        int i = new LongestSubsequence_0300().lengthOfLIS(new int[]{0,1,0,3,2,3});
        assertEquals(4, i);
    }

    @Test
    void test03() {
        int i = new LongestSubsequence_0300().lengthOfLIS(new int[]{7,7,7,7,7,7,7});
        assertEquals(1, i);
    }

    @Test
    void test04() {
        int i = new LongestSubsequence_0300().lengthOfLIS(new int[]{100, 200, 300, 1, 2, 3, 4, 5, 6}); //3!? =, 6
        assertEquals(6, i);


    }
}