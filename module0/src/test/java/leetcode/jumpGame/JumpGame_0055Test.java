package leetcode.jumpGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGame_0055Test {
    @Test
    void name001_simple() {
        boolean b = new JumpGame_0055().canJump(new int[] {1});
        assertEquals(true, b);
    }

    @Test
    void name001_simpleNegative() {
        boolean b = new JumpGame_0055().canJump(new int[] {0});
        assertEquals(true, b);
    }

    @Test
    void name001_simpleNegativeTwoZero() {
        boolean b = new JumpGame_0055().canJump(new int[] {0, 0});
        assertEquals(false, b);
    }

    @Test
    void name001_simpleReachLastStep() {
        boolean b = new JumpGame_0055().canJump(new int[] {2, 0, 0});
        assertEquals(true, b);
    }

    @Test
    void name001_simpleShowExample() {
        boolean b = new JumpGame_0055().canJump(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 0, 0, 0, 2, 0, 999});
        assertTrue(b);
    }

    @Test
    void name001_zero() {
        boolean b = new JumpGame_0055().canJump(new int[] {2, 0, 1});
        assertEquals(true, b);
    }

    @Test
    void name00a1() {
        boolean b = new JumpGame_0055().canJump(new int[] {2,3,1,1,4});
        assertEquals(true, b);
    }

    @Test
    void name00a2() {
        boolean b = new JumpGame_0055().canJump(new int[] {3,2,1,0,4});
        assertEquals(false, b);
    }
}