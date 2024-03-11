package leetcode.findAllDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicates_0442 {
    public List<Integer> findDuplicates(int[] nums) {
        final List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int refIndex = Math.abs(nums[i]) - 1;
            if(nums[refIndex] < 0) {
                result.add(Math.abs(nums[i]));
            } else {
                nums[refIndex] = -nums[refIndex];
            }
        }
        return result;
    }
}
