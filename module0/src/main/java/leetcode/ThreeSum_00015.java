package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_00015 {

//             l>><r  res = [[-6,2, 4]]
//    left>>>>>>               <<<<<<right
//    i  =================================i
//    //[-100, -100, -6, -6, 0, 1, 1, 2, 2, 4, 4, 4]; -> A
//                           i  l >>             <<r
//

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(nums.length/2);
        // Sort the array
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // Found a triplet with zero sum
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate elements for j
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicate elements for k
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move the pointers
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is less than zero, increment j to increase the sum
                    left++;
                } else {
                    // Sum is greater than zero, decrement k to decrease the sum
                    right--;
                }
            }
        }
        return ans;
    }
}
