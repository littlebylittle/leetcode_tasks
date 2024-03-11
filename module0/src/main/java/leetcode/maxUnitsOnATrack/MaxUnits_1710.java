package leetcode.maxUnitsOnATrack;

import java.util.Arrays;
import java.util.Comparator;

public class MaxUnits_1710 {
    public int maximumUnits(final int[][] boxTypes, final int truckSize) {
        Arrays.sort(boxTypes, (o1, o2) -> o2[1] - o1[1]);

        int remained = truckSize;
        int sum = 0;
        for (int i = 0; i < boxTypes.length && remained > 0; i++) {
            var currentBox = boxTypes[i];
            if(currentBox[0] <= remained) {
                sum += currentBox[0] * currentBox[1];
                remained -= currentBox[0];
            } else { // currentBox[0] > remained
                sum += remained * currentBox[1];
                remained = 0;
            }
        }
        return sum;
    }
}
