package leetcode;

public class ClimbingStairs_00070 {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int prev_2 = 1;
        int prev_1 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = prev_1;
            prev_1 = prev_2 + prev_1;
            prev_2 = temp;
        }
        return prev_1;
    }
}
