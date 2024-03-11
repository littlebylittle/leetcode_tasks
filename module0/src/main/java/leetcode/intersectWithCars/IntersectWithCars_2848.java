package leetcode.intersectWithCars;

import java.util.HashSet;
import java.util.List;

public class IntersectWithCars_2848 {
    //[[3,6],[1,5],[4,7]]
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] all = new int[101];
        for (List<Integer> integer : nums) {
            for (int i = integer.get(0); i <=integer.get(1) ; i++) {
                all[i] = 1;
            }
        }
        int sum =0;
        for (int i = 0; i < all.length; i++) {
            sum += all[i];
        }
        return sum;
    }
}
