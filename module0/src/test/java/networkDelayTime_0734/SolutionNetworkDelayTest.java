package networkDelayTime_0734;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionNetworkDelayTest {
    @Test
    void nameBasic() {
        //(1) ==== 2 =====> (2);  k = 1; n = 2;  exptected == 2;
        int actual = new SolutionNetworkDelay().networkDelayTime(new int[][] {{1,2, 100}}, 2, 1);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void nameBasic_01() {
        //(1) ==== 2 =====> (2);  k = 1; n = 2;  exptected == 2;
        int actual = new SolutionNetworkDelay().networkDelayTime(new int[][] {{1,2, 100}}, 2, 1);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void nameBasic_notHaveArouteForLamp() {
        //[[1,2,1],[2,3,7],[1,3,4],[2,1,2]], n=4, k=1
        int actual = new SolutionNetworkDelay().networkDelayTime(new int[][]  {{1,2,1},{2,3,7},{1,3,4},{2,1,2}}, 4, 1);
        int expected = -1;
        assertEquals(expected, actual);
    }
}