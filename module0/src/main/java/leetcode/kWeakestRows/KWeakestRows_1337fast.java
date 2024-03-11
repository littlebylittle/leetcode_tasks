package leetcode.kWeakestRows;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class KWeakestRows_1337fast {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        final Integer[][] sumArray = new Integer[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            sumArray[i][0] = i; //rownumber
            sumArray[i][1] = sum;
        }
        Arrays.sort(sumArray, (o1, o2) -> o1[1] - o2[1]);
        for (int i = 0; i < k; i++) {
            res[i] = sumArray[i][0];
        }
        return res;
    }
}
