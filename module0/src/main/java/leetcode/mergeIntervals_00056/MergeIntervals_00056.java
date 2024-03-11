package leetcode.mergeIntervals_00056;

import java.util.LinkedList;

public class MergeIntervals_00056 {

    private static final int RIGHT = 1;
    private static final int LEFT = 0;

    public int[][] merge(int[][] intervals) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < intervals.length; i++) {
            min = Math.min(min, intervals[i][LEFT]);
            max = Math.max(max, intervals[i][LEFT]);
        }

        int[] range = new int[max - min + 1];
        for (int intervalElement = 0; intervalElement < intervals.length; intervalElement++) {
            int rightBorder = intervals[intervalElement][RIGHT] - min;
            int leftBorder = intervals[intervalElement][LEFT] - min;
            range[leftBorder] = Math.max(rightBorder, range[leftBorder]);
        }

        int start = 0, end = 0;
        LinkedList<int[]> result = new LinkedList<>();
        for (int i = 0; i < range.length; i++) {
            String s;
            if (range[i] == 0) {
                                s = "start: " + start + " end: " + end + " i: " + i + " range[i]: " + range[i];
//                if(true){assert true; start = start;} //debug purpose
                continue;
            }

            if (i <= end) {
                end = Math.max(range[i], end);
//                s = "start: " + start + " end: " + end + " i: " + i + " range[i]: " + range[i];
//                if(true){assert true; start = start;} //debug purpose
            } else {
                result.add(new int[] {start + min, end + min});
                start = i;
                end = range[i];
//                s= "start: " + start + " end: " + end + " i: " + i + " range[i]: " + range[i]; //debug purpose
//                if(true){assert true; start = start;}
            }
        }
        result.add(new int[] {start + min, end + min});
        return result.toArray(new int[result.size()][]);
    }
}
