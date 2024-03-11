package leetcode.sortCharactersByFreq;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortByFrequency_0451Test {
    @Test
    void name() {
        String res = new SortByFrequency_0451().frequencySort("tree");

        assertTrue("eert".equals(res) || "eetr".equals(res));
    }

    @Test
    void name02() {
        String res = new SortByFrequency_0451().frequencySort("loveleetcode");
        assertEquals("eeeeoollvtdc", res);

    }
}