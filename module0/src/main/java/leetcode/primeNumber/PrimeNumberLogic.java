package leetcode.primeNumber;

import java.util.Set;
import java.util.TreeSet;

public class PrimeNumberLogic {
    public int getLastPrime() {
        return lastPrime;
    }

    private final Set<Integer> cache = new TreeSet<>(Set.of(2, 3, 5, 7));
    private int lastPrime = 5;
    public boolean isPrime(int toCheck) {
        if(toCheck <=1) {
            return false;
        }

        if(toCheck<= lastPrime) {
            return cache.contains(toCheck);
        }

        boolean numIsPrime = true;
        //still is prime? update cache
        int leftBorder = (int) Math.sqrt(toCheck) + 1;
        for (int i = 2; i <= leftBorder ; i++) {
            if (toCheck % i == 0) {
                numIsPrime = false;
                return false;
            }
        }
        if(numIsPrime) {
            cache.add(toCheck);
            lastPrime = toCheck;
        }
        return  numIsPrime;
    }
}
