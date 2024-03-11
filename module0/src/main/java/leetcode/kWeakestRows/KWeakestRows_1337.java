package leetcode.kWeakestRows;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KWeakestRows_1337 {

    public int[] kWeakestRows(int[][] mat, int k) {
        final PriorityQueue<Integer[]> pq = new PriorityQueue<>(
                (o1, o2) -> {
                    int i = o1[1] - o2[1];
                    if(i != 0) return i;
                    return o1[0]-o2[0]; //compare lineNumbers, from lowest to highest
                }
        );
        final Integer[][] sumArray = new Integer[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            sumArray[i][0] = i; //rownumber
            sumArray[i][1] = sum;
            pq.add(sumArray[i]);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll()[0];
        }
        return res;
    }
}
