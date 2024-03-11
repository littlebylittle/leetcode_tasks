package leetcode.smallestInInfiniteSet_2336;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class SmallestInfiniteSet {
    private int current;
    private TreeSet<Integer> before;

    public SmallestInfiniteSet() {
        current = 1;
        before = new TreeSet<>();
    }

    public int popSmallest() {
        if(before.size() > 0) {
            return before.pollFirst();
        }
        return current++;
    }

    public void addBack(int num) {
        if(num >= current || before.contains(num)) {
            return;
        }
        before.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
