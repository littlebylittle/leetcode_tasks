package leetcode.twoStringsAreAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StepsToAnagram_1347Test {
    @Test
    void name() {
        int i = new StepsToAnagram_1347().minSteps("leetcode", "practice");
        assertEquals(5, i);
    }
}