package leetcode.decodeWays_0091;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWays_0091Test {
    @Test
    void name() {
        int i = new DecodeWays_0091().numDecodings("12");
        assertEquals(2, i);
    }

    @Test
    void name01_notfailzero() {
        int i = new DecodeWays_0091().numDecodings("120");
        assertEquals(1, i);
    }

    @Test
    void name01_bg() {
        int i = new DecodeWays_0091().numDecodings("2727"); //bgbg
        assertEquals(1, i);
    }
    @Test
    void name0_1020_fail() {
        int i = new DecodeWays_0091().numDecodings("1020");
        assertEquals(1, i);
    }

    @Test
    void name01_failzero() {
        int i = new DecodeWays_0091().numDecodings("1111260");
        assertEquals(0, i);
    }


    @Test
    void name01_111111111() {
        int i = new DecodeWays_0091().numDecodings("1111111111");
        assertEquals(89, i);
    }

    @Test
    void name01_xxxx() {
        int i = new DecodeWays_0091().numDecodings("11111111011");
        assertEquals(42, i);
    }

    @Test
    void name01_xxxx11() {
        int i = new DecodeWays_0091().numDecodings("12121");
        assertEquals(8, i);
    }

    @Test
    void name01_input0() {
        int i = new DecodeWays_0091().numDecodings("0");
        assertEquals(0, i);
    }

    @Test
    void name01_input_oneDigit() {
        int i = new DecodeWays_0091().numDecodings("9");
        assertEquals(1, i);
    }

    @Test
    void name2() {
        int i = new DecodeWays_0091().numDecodings("1002");
        assertEquals(0, i);
    }

    @Test
    void name3() {
        int i = new DecodeWays_0091().numDecodings("2728");
        assertEquals(1, i);
    }

    @Test
    void name4() {
        int i = new DecodeWays_0091().numDecodings("272811");
        assertEquals(2, i);
    }
}