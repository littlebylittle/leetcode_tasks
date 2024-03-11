package leetcode.mergeIntervals_00056;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervals_00056Test {
    @Test
    void namex() {
        var res = new MergeIntervals_00056().merge(new int[][] {{1,3},{2,6}, {8,10}, {15,18}});
        assertArrayEquals(res, new int[][] {{1,6}, {8,10}, {15,18}});
    }

    @Test
    void namex2() {
        var res = new MergeIntervals_00056().merge( new int[][] {{2,3},{5,5},{2,2},{3,4},{3,4}} );
        assertArrayEquals(res, new int[][] {{2,4}, {5,5}} );
    }

    @Test
    void namex3() {
        var res = new MergeIntervals_00056().merge(new int[][] {{1,3},{2,6}, {4,7}, {8,9}, {8,10}, {15,18}});
        assertArrayEquals(res, new int[][] {{1,7}, {8,10}, {15,18}});

        //{  {1,3},           {2,6}, {4,7}, {8,10}, {15,18}    } => [1,7] , [8,10], [15,18];
        //1,3 (-1) => 0, 2;   (2,6)(1)=> (1, 5) index =1; max(RESULT, RIGHT)
        //  (4,7) => 3,6;
        //   8 , 9; 7, 8
        //   8, 10 -> (7, 9) => index[i] == max(8, 9)
        //  {15, 18} => 14, 17
        /*
        LEFT_MIN = 1; LEFT_MARGIN
        LEFT_MAX =  15;  N
        nwe Array [15 == 1015-1000];
        result[i]

        //
                              start=7,
                              V
                                End=8
                                    |
                                    V
        [2, 5, 0, 6, 0, 0, 0, 9, 0, 0, 0, 0,   0,  0, 17]
         0  1  2  3  4  5  6  7  8  9  10  11 12   13 14
                                                      ^
                                                      i
        start=0, end =6 ; margin = 1; (0+1, 6+1); RESULT = (1,7), (8,10) (15, 18)
        start = 7;
        end= 9

        result+= start + M, end+M => (7+1,  9+1) => (8, 10)
        start = i = 14;
        end = 17
        } end for
        RESULT +=  start, end ) +maring => 14 + 1, 17+1 = 15, 18












         */

    }
    @Test
    void namex4() {
        var res = new MergeIntervals_00056().merge(new int[][] {{1,3},{2,6}, {3,8}, {8,10}, {15,18}});
        assertArrayEquals(res, new int[][] {{1,10}, {15,18}});
    }
}