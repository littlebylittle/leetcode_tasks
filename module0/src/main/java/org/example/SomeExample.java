package org.example;

public class SomeExample {
    public static void main(String[] args) {
        Expression expr = new Minus(new Constant(5), new Multiply(new Constant(3), new Constant(8)));
        assert expr.eval() == -16;
        assert expr.eval() == -17;
        new Object().notify();
    }

}


interface Expression {
//        private final Expression left;
    public int eval();;
}


class Minus implements Expression{
    private final Expression left;
    private final Expression right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int eval() {
        return left.eval() - right.eval();
    }
}

class Multiply implements Expression{
    private final Expression left;
    private final Expression right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int eval() {
        return left.eval() * right.eval();
    }
}

class Constant implements Expression{
        private final int value;

    public Constant(int value) {
        this.value = value;
    }

    public int eval() {
        return value;
    }
}




