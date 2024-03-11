package leetcode.carPooling;

import java.util.Arrays;
import java.util.Comparator;

public class CarPooling_1094 {
//    public boolean carPooling(int[][] trips, int capacity) {
//        Arrays.sort(trips, (l, r) -> {//int[] = [num, from, to]
//            int compare = Integer.compare(l[1], r[1]);
//            if(0 == compare) {
//                return Integer.compare(l[2], r[2]);
//            }
//            return compare;
//        });
//
//        int from=0;
//        int to= 0;
//        int size = 0;
//        for (int i = 0; i < trips.length; i++) {
//            if(trips[i][1]/*newStart*/ >= to) { //so we don't have any interlap
//                size += trips[i][0];
//                from = trips[i][1];
//                to = trips[i][2];
//                if(size > capacity) {
//                    return false;
//                }
//                continue;
//            } // no interlap
//            //have interlap
//            if()
//        }
//        return false;
//    }


    public boolean carPooling(int[][] trips, int capacity) {
        int[] loads = new int[1001];

        for (int i = 0; i < trips.length; i++) {  //int[] trips = [num, from, to]
            loads[trips[i][1]/*from*/] += trips[i][0];
            loads[trips[i][2]/*to*/] -= trips[i][0];
        }

        int load = 0;
        for (int i = 0; i < loads.length; i++) {
            load = load + loads[i];
            if(load > capacity) {
                return false;
            }
        }
        return true;
    }
}
