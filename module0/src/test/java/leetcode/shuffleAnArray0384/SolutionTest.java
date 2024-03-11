package leetcode.shuffleAnArray0384;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void name_000() {
        int[] nums = {1};
        Solution solution = new Solution(nums);
        int[] reset = solution.reset();
        assertEquals(nums, reset);
    }

    @Test
    void name_01() {

    }
}