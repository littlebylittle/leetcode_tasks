package leetcode.allAnagrams_0438;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsTest {
    @Test
    void name() {
        List<Integer> anagrams = new FindAllAnagrams().findAnagrams("cbaebabacd", "abc");
        assertEquals(List.of(0, 6), anagrams);
    }
}