package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Duplicates_00217 {
    private final Map<Integer, Boolean> map = new HashMap<>();
    public boolean containsDuplicate(int[] nums) {
        if(nums.length <=1) return false;
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) return true;
            map.put(nums[i], Boolean.TRUE);
        }
        return false;
    }
}
