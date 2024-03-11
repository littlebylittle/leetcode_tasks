package leetcode;

public class SearchInRotated_00033 {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) return mid;

            if (nums[l] <= nums[mid]) {  //target shall be in [left, middle) or (middle, right]
                if (target >= nums[l] && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return nums[l] == target ? l : -1;
    }

    public int search_naive(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num == target ) return i;
        }

        return -1;
    }
}
