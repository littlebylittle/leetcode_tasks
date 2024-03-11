package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeExampleTest {
    @Test
    void name() {
        //5-(3*8) = 5-24= -19
        Expression expr = new Minus(new Constant(5), new Multiply(new Constant(3), new Constant(8)));
        assertEquals(-19, expr.eval());
    }

    //expresion => Parser => List(Lexem);
    //LiST => AST(LEXEM); TRANSFORM_BUILD => EXPRESSION_CHAIN == new Minus(new Constant(5), new Multiply(new Constant(3), new Constant(8)));
    //eval()
}