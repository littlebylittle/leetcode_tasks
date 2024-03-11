package leetcode.expressions.basicCalculator.polishNotation;

import java.util.Arrays;
import java.util.Optional;

public final class Token {
    public final T type;
    public final String value;

    public Token(T type, String value) {
        this.type = type;
        this.value = value;
    }

    public static Token build(char fromChar) {
        Optional<T> res = Arrays.stream(T.values())
                .filter(el -> el.symbol == fromChar)
                .findAny();
        return res.orElseThrow().toToken();
    }

    @Override
    public String toString() {
        if(this.type == T.number) {
            return this.value;
        }
        return String.valueOf(type.symbol);
    }

    public static enum T {
        openParenthesis('(',0),
        closeParenthesis(')',1),
        unarMinus('~', 10),
        minus( '-', 7),
        plus('+', 7),
        factor('*', 8),
        divide('/', 8),
        number('\0', -999);

        private final char symbol;
        public final int priority;


        private T(char symbol, int priority) {
            this.symbol = symbol;
            this.priority = priority;
        }

        public final Token toToken(String value) {
            return new Token(this, value);
        }

        public final Token toToken() {
            return new Token(this, null);
        }

        public final static int priority(char symbol) {
            Optional<T> res = Arrays.stream(T.values())
                    .filter(el -> el.symbol == symbol)
                    .findAny();
            if(res.isEmpty()) {
                throw new UnsupportedOperationException("Can't parse symbol" + symbol);
            }
            return res.get().priority;
        }
    }
}
