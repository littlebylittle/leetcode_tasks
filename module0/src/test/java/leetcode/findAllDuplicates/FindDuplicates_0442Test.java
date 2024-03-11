package leetcode.findAllDuplicates;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicates_0442Test {
    @Test
    void name() {
        List<Integer> duplicates = new FindDuplicates_0442().findDuplicates(new int[]{1, 2, 3, 4, 5, 1, 2});
        assertEquals(List.of(1,2), duplicates);
    }

    @Test
    void name01() {
        List<Integer> duplicates = new FindDuplicates_0442().findDuplicates(new int[] {4,3,2,7,8,2,3,1});
        assertEquals(List.of(2, 3), duplicates);
    }

    @Test
    void name02() {
        List<Integer> duplicates = new FindDuplicates_0442().findDuplicates(new int[] {1,1,2});
        assertEquals(List.of(1), duplicates);
    }

    @Test
    void name03() {
        List<Integer> duplicates = new FindDuplicates_0442().findDuplicates(new int[] {1});
        assertEquals(List.of(), duplicates);
    }
}