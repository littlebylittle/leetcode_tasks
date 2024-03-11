package leetcode.deleteGreatesInEachRow_2500;

import java.util.Arrays;

public class DeleteGreatest {
    /*
         1 2 4
         3 3 1
         \\
          V
        4 2 1   (sum==0 * max => 0+ 4) => sum = 4
        3 3 1
            2 1  (max == 3), sum += max = 4+3 = 7
            3 1

                1 max(1), sum += max => 7 + 1 = 8
                1

        PLAN:
        GRID   j 0 , 1 , 2 , 3, 4
               ==================
        a)  i 0| sort i=0
              1| sort i=1
              2| sort

           sum = 0;


           for j=0; to grid[0].length do:
                max = 0;
                for i in 0...grid.lenth:
                    grid[i][j] > max => max := grid[i][j]

                sum += max;

            return sum;
        */
    public int deleteGreatestValue(int[][] grid) {
        //sort
        int height = grid.length;
        for (int i = 0; i < height; i++) {
            Arrays.sort(grid[i]);
        }
        //for j
        int sum = 0;
        final int length = grid[0].length;

        for (int j = 0; j < length; j++) {
            int max = grid[0][j];
            for (int i = 1; i < height; i++) {
                max = Math.max(max, grid[i][j]);
            }
            sum += max;
        }
        for (int i = 0; i < 1; i++) {
        }
        return sum;
    }

    /**
     *         int m = grid.length;
     *         for (int i = 0; i < m; i++) {
     *             Arrays.sort(grid[i]);
     *         }
     *         int tot = 0;
     *         int n = grid[0].length;
     *         for (int i = 0; i < n; i++) {
     *             int cur = get_max(grid, i);
     *             tot += cur;
     *         }
     *         return tot;
     *     }
     *
     *     private int get_max(int[][] grid, int col) {
     *         int max = grid[0][col];
     *         int m = grid.length;
     *         for (int i = 1; i < m; i++) {
     *             max = Math.max(max, grid[i][col]);
     *         }
     *         return max;
     *     }
     */
}