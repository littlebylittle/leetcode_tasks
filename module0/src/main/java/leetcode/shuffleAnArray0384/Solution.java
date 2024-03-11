package leetcode.shuffleAnArray0384;

public class Solution {
    private final int[] orignalNums;
    private int[] iteration = new int[]{};
    public Solution(final int[] nums) {
        orignalNums = nums;
        iteration = nums.clone();
    }

    public int[] reset() {
        return orignalNums;
    }

    public int[] shuffle() {
        throw new RuntimeException();
    }
}
