package leetcode.findMedianFromDataStream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianFinder_0295_Test {
    @Test
    void name01() {
        MedianFinder_0295 medianFinder = new MedianFinder_0295();
        medianFinder.addNum(100);
        medianFinder.addNum(50);
        medianFinder.addNum(1);
        medianFinder.addNum(1);
        medianFinder.addNum(4);
        medianFinder.addNum(5);
        medianFinder.addNum(11);
        medianFinder.addNum(21);
        medianFinder.addNum(32);
        medianFinder.addNum(42);
        medianFinder.addNum(52);
        medianFinder.addNum(72);
        medianFinder.addNum(77);

        medianFinder.addNum(60);
        double res = medianFinder.findMedian();
        assertEquals(55d, res);
    }
}