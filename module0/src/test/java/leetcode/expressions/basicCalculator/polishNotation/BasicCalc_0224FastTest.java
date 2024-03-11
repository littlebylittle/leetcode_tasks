package leetcode.expressions.basicCalculator.polishNotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalc_0224FastFastTest {
    @Test
    void name() {
        int calculate = new BasicCalc_0224Fast().calculate("(( 10-(7+8))*11-(12+1)"); //-55-13 = -68
        assertEquals(-68, calculate);
    }

    @Test
    void name2() {
        int calculate = new BasicCalc_0224Fast().calculate("1+1"); //-55-13 = -68
        assertEquals(2, calculate);
    }

    @Test
    void name22() {
        int calculate = new BasicCalc_0224Fast().calculate("(17+17)"); //-55-13 = -68
        assertEquals(34, calculate);
    }

    @Test
    void name222() {
        int calculate = new BasicCalc_0224Fast().calculate("-(17+17)"); //-55-13 = -68
        assertEquals(-34, calculate);
    }

    @Test
    void nameZeroToNegative() {
        int calculate = new BasicCalc_0224Fast().calculate("-(-15+ 15)"); //-55-13 = -68
        assertEquals(0, calculate);
    }

    @Test
    void negativeNegativeTest() {
        int calculate = new BasicCalc_0224Fast().calculate("-(-15+ 1)"); //-55-13 = -68
        assertEquals(14, calculate);
    }

    @Test
    void negativeNegativeTest2() {
        int calculate = new BasicCalc_0224Fast().calculate("2-1+2"); //-55-13 = -68
        assertEquals(3, calculate);
    }

    @Test
    void negativeNegativeTest22() {
        int calculate = new BasicCalc_0224Fast().calculate("2-11-2"); //-55-13 = -68
        assertEquals(-11, calculate);
    }

    @Test
    void expressionWithnegativeUnaryMinus() {
        int calculate = new BasicCalc_0224Fast().calculate("-(3+4)+5"); //-55-13 = -68
        assertEquals(-2, calculate);
    }

}