package leetcode.makeZero_2357;

public class MakeZeroSubtracting_2357 {
    public int minimumOperations(int[] nums) {
        int[] numbers = new int[101];
        for (int i = 0; i < nums.length; i++) {
            numbers[nums[i]]++;
        }
        int answer = 0;

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] !=0 ) {
                answer ++;
            }
        }
        return answer;
    }
}
