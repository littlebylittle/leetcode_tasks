package leetcode.lastStoneWeight;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight_1046 {
    public int lastStoneWeight(int[] input) {
        //[2,7,4,1,8,1]
        //        while(pq > 1)
        //            pol pol => 8, 7
        //        pq.add(8-7)
        //        pol, poll
        //
        //        if(pq size = 0 ) return 0;
        //        return pq.poll;
        //[100, 50] => [50] => 50
        Queue<Integer> stonesQ = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < input.length; i++) {
            stonesQ.add(input[i]);
        }
        while(stonesQ.size() >= 2) {
            var a1 = stonesQ.poll();
            var a2 = stonesQ.poll();
            int abs = Math.abs(a1 - a2);
            if(abs != 0) {
                stonesQ.add(abs);
            }
        }
        if(stonesQ.isEmpty()) {
            return 0;
        }
        return stonesQ.poll();
    }
}
