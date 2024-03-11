package leetcode.decodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeString_0394Test {
    @Test
    void name() {
        String s = new DecodeString_0394().decodeString("3[a]2[bc]");
        assertEquals("aaabcbc", s);
    }

    @Test
    void name2() {
        String s = new DecodeString_0394().decodeString("3[a2[c]]");
        assertEquals("accaccacc", s);
    }

    @Test
    void name03x() {
        String s = new DecodeString_0394().decodeString("2[abc]3[cd]ef");
        assertEquals("abcabccdcdcdef", s);
    }
}