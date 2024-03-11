package leetcode.topKfrequentElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequent_0347Test {
    @Test
    void name01() {
        var res = new TopKFrequent_0347().topKFrequent(new int[] {1,1,1,2,2,3}, 2);
        assertArrayEquals(new int[]{1,2}, res);
    }

    @Test
    void name011() {
        var res = new TopKFrequent_0347().topKFrequent(new int[] {1,2}, 2);
        assertArrayEquals(new int[]{1,2}, res);
    }
}