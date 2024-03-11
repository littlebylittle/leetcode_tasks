package leetcode;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class FindMin_00153Test {
    public static final double DELIMITOR = 10e3;
    static int[] ints = IntStream.concat(IntStream.range(10_000, 100_000_000), IntStream.range(-9_000_000, 5_000))
            .toArray();
    @Test
    void naive_test() {
        double sum = 0;
        for (int i = 0; i < 100; i++) {
             sum += naive_extracted()/DELIMITOR;
        }
        double avg = sum /100;
        System.out.println("NAIVE execution AVG time in mk: " + avg);
    }

    @Test
    void test() {
        double sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += extracted()/ DELIMITOR;
        }
        double avg = sum /100;
        System.out.println("execution AVG time in mk: " + avg);
    }

    private static long naive_extracted() {
        FindMin_00153 object = new FindMin_00153();
        long before = System.nanoTime();
        int i = object.naiveFindMin(ints);
        long after = System.nanoTime();
        return after - before;
    }

    private static long extracted() {
        FindMin_00153 findMin00153 = new FindMin_00153();
        long before = System.nanoTime();

        int i = findMin00153.findMin(ints);
        long after = System.nanoTime();
        return after - before;
    }
}