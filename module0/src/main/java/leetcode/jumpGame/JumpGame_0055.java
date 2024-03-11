package leetcode.jumpGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class JumpGame_0055 {
    public boolean canJump(int[] nums) {//greedy? boolean b = new JumpGame_0055().canJump(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0, 0, 0, 2, 0, 999});
        int goal = nums.length -1;
        for (int i = goal-1; i >=0 ; i--) {
            if(i+nums[i]>=goal) {
                goal = i;
            }
        }
        return goal == 0;
    }

    public boolean canJump2(int[] nums) {
        if (nums.length == 1) return true;
        if (nums[0] == 0) return false;
        int i = nums.length - 2;
        Stack<Integer> st = new Stack<>();
        while (i >= 0) {
            if (nums[i] == 0) {
                st.push(i);
            } else {
                while (!st.isEmpty() && i + nums[i] > st.peek()) {
                    st.pop();
                }
            }
            i--;
        }
        return st.isEmpty();
    }
}
