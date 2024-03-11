package leetcode;

public class Product_00238 {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                zeroCount += 1;
                if(zeroCount == 2) {
                    return new int[nums.length];
                }
            } else {
                product *= nums[i];
            }
        }

        int[] result = new int[nums.length];
        if(zeroCount == 1) {
            for (int i = 0; i < result.length; i++) {
                if(nums[i] == 0) {
                    result[i] = product;
                    return result;
                }
            }
        }

        //zercount == 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = product / nums[i];
        }
        return result;
    }
}
