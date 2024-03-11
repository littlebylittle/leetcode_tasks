package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagram_0242Test {
    @Test
    void name001() {
        boolean anagram = new ValidAnagram_0242().isAnagram("anagram", "nagaram");
        assertEquals(true, anagram);

    }
}