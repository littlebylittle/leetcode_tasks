package leetcode;

public class FindMin_00153 {
    public int naiveFindMin(int[] nums) {
        int min = nums[0];
        for (int num : nums) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

    public int findMin(int[] nums) {
        int res = nums[0]; // Setting any random value
        int l = 0;
        int r = nums.length - 1;

        while (l <= r){
            // If the array is already sorted
            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            int m = (l + r) / 2;
            res = Math.min(res, nums[m]);
            if (nums[m] >= nums[l]){
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return res;
    }
}
