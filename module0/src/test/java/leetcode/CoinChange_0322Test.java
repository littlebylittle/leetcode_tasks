package leetcode;

import leetcode.coinChange_0322.CoinChange_0322;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChange_0322Test {
    @Test
    void name_001() {

        //3
        // [1, 3, 4, 5]
        //  ^
        //  f(+1), nextCalculateSum = sum-1=0; rec([3,4,5,1],   sum=2); (1); $2; (1) => 1; (1) => 3, sum =0
        int i = new CoinChange_0322().coinChange_naive2(new int[]{1, 3, 4, 5, 1, 1}, 3);
        assertEquals(i, 1);
    }

    @Test
    void name_002() {
        int i = new CoinChange_0322().coinChange_naive2(new int[]{1, 2, 5, 7}, 11);
        //                                                      i 0  1  2  3
        assertEquals(i, 3);
    }
}