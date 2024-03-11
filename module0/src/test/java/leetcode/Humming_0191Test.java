package leetcode;

import org.junit.jupiter.api.Test;

import java.util.HexFormat;

import static org.junit.jupiter.api.Assertions.*;

class Humming_0191Test {
    @Test
    void name1() {
        int i = HexFormat.fromHexDigits("FFFE");
        int res = new Humming_0191().hammingWeight(i);
        assertEquals(15, res);
    }

    @Test
    void name2() {
        int res = new Humming_0191().hammingWeight(0x7f_ff_ff_ff);
        assertEquals(30, res);
    }

    @Test
    void name3() {
//        Integer.toBinaryString(Integer.MAX_VALUE);
        int res = new Humming_0191().hammingWeight(0x7f_ff_ff_ff);
        assertEquals(31, res);
    }

    @Test
    void name33() {
        int res = new Humming_0191().hammingWeight(-1);
        assertEquals(32, res);
    }
}