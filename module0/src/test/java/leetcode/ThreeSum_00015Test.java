package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.*;

class ThreeSum_00015Test {
    @Test
    void name() {
        List<List<Integer>> lists = new ThreeSum_00015().threeSum(new int[]{-3, 1, 2});
        assertEquals(of(of(-6, -3, 1, 2, 3, 3)), lists);
    }
}