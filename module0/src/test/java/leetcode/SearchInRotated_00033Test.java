package leetcode;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotated_00033Test {
    public static final double DELIMITOR = 10e3;
    static int[] ints = IntStream.concat(IntStream.range(10_000, 100_000_000), IntStream.range(-9_000_000, 5_000))
            .toArray();
    @Test
    void naive_test() {
        double sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += naive_extracted(9_000_000)/DELIMITOR;
        }
        double avg = sum /100;
        System.out.println("NAIVE execution AVG time in mk: " + avg);
    }

    @Test
    void test() {
        double sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += extracted(9_000_000)/ DELIMITOR;
        }
        double avg = sum /100;
        System.out.println("execution AVG time in mk: " + avg);
    }

    private static long naive_extracted(int target) {
        SearchInRotated_00033 logic = new SearchInRotated_00033();
        long before = System.nanoTime();
        int i = logic.search_naive(ints, target);
//        assertEquals(8990000, i);
        long after = System.nanoTime();
        return after - before;
    }

    private static long extracted(int target) {
        SearchInRotated_00033 logic = new SearchInRotated_00033();
        long before = System.nanoTime();

        int i = logic.search(ints, target);
//        assertEquals(8990000, i);
        long after = System.nanoTime();
        return after - before;
    }

}