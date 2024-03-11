package leetcode;

public class Subarray_00053 {//maximum subarray
    public int maxSubArray(int[] nums) {
        int answer = Integer.MIN_VALUE;
        int lastSum = 0;
        for(int num : nums){
            lastSum += num;
            answer = Math.max(answer, lastSum);
            lastSum = Math.max(lastSum, 0);
        }
        return answer;
    }
}
