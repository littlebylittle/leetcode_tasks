package leetcode.primeNumber;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberLogicTest {
    private static final PrimeNumberLogic  logic = new PrimeNumberLogic();
    @Test
    void name01() {
        boolean prime = logic.isPrime(-1);
        assertEquals(false, prime);
    }

    @Test
    void name02() {
        boolean prime = logic.isPrime(3);
        assertEquals(true, prime);
    }

    @Test
    void name03() {
        boolean prime = logic.isPrime(4);
        assertEquals(false, prime);
    }

    @Test
    void name_rangeTest() {
        IntStream.range(2, 100_000+1).forEach(el -> logic.isPrime(el));
        assertEquals(1013904223, logic.getLastPrime());
    }
}