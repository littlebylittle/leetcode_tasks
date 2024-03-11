package leetcode.permutationInString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStr_0567Test {
    @Test
    void name() {
        boolean res= new PermutationInStr_0567().checkInclusion("ab", "eidbaooo");
        assertEquals(true, res);
    }

    @Test
    void name02() {
        boolean res= new PermutationInStr_0567().checkInclusion("ab", "eidboaoo");
        assertEquals(false, res);
    }
}