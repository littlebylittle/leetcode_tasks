package leetcode.robHouse_0020;

public class RobHouse_0020 {
    public int rob(int[] num) {
        int prevRob = 0; //max monney can get if rob current house
        int prevNotRob = 0; //max money can get if not rob current house
        for (int i = 0; i < num.length; i++) {
            int currob = prevNotRob + num[i]; //if rob current value, previous house must not be robbed
            prevNotRob = Math.max(prevNotRob, prevRob); //if not rob ith house, take the max value of robbed (i-1)th house and not rob (i-1)th house
            prevRob = currob;
        }
        return Math.max(prevRob, prevNotRob);
    }
}
