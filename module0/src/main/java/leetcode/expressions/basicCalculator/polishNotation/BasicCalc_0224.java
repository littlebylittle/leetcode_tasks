package leetcode.expressions.basicCalculator.polishNotation;


import java.util.*;

public class BasicCalc_0224 {
    private final Tokenizer tokenizer = new Tokenizer();
    public int calculate(String sInput) {
        List<TokenB> list = tokenizer.parse(sInput);
        String format = String.format("tokens: %s", list);
        System.out.println(format);
        Stack<TokenB> stack = new Stack<>();

        for (TokenB token : list) {
            if(token.type == TokenB.T.number) {
                stack.push(token);
                continue;
            }
            //binary operation
            if(token.type == TokenB.T.factor) {
                int res = Integer.valueOf(stack.pop().value) * Integer.valueOf(stack.pop().value);
                stack.push(new TokenB(TokenB.T.number, String.valueOf(res)));
                continue;
            }

            if(token.type == TokenB.T.plus) {
                int res = Integer.valueOf(stack.pop().value) + Integer.valueOf(stack.pop().value);
                stack.push(new TokenB(TokenB.T.number, String.valueOf(res)));
                continue;
            }
            if(token.type == TokenB.T.minus) {
                Integer right = Integer.valueOf(stack.pop().value);
                Integer left = Integer.valueOf(stack.pop().value);
                int res = left-right;
                stack.push(new TokenB(TokenB.T.number, String.valueOf(res)));
                continue;
            }

            if(token.type == TokenB.T.divide) {
                Integer right = Integer.valueOf(stack.pop().value);
                Integer left = Integer.valueOf(stack.pop().value);
                int res = left/right;
                stack.push(new TokenB(TokenB.T.number, String.valueOf(res)));
                continue;
            }
            if(token.type == TokenB.T.unarMinus) {
                Integer right = Integer.valueOf(stack.pop().value);
                int res = -right;
                stack.push(new TokenB(TokenB.T.number, String.valueOf(res)));
                continue;
            }

            throw new UnsupportedOperationException("WWe don't know what to do with: " + token.toString());
        }
        TokenB result = stack.pop();
        return Integer.valueOf(result.value);
    }
}

class Tokenizer { //or tokenizer?
    public List<TokenB> parse(String infixInput) { //result doesn't contain any brackets, parenthesis;
        char[] chars = infixInput.toCharArray();
        StringBuilder numberBuffer = new StringBuilder();

        final List<TokenB> result = new ArrayList<>();
        Stack<TokenB> stack = new Stack<>(); //here we keeps openingBrackets and Operations (+-/*)
        boolean nextIsUnar = true;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(Character.isDigit(c)) {
                numberBuffer.append(c);
                continue;
            }
            if(! numberBuffer.isEmpty()) {
                result.add(TokenB.T.number.toToken(numberBuffer.toString()));
                numberBuffer = new StringBuilder();
                nextIsUnar = false;
            } //proceed

            if( '(' == c) {
                stack.push(TokenB.T.openParenthesis.toToken());
                nextIsUnar = true;
                continue;
            }
            if( ')' == c) { //expect that the expression is correct, our assumption from the task;
                while(!stack.empty() && TokenB.T.openParenthesis != stack.peek().type) {
                    result.add(stack.pop());
                }
                stack.pop(); //remove last open parenthesis
                nextIsUnar = false;
                continue;
            }
            if('-' == c && nextIsUnar) {
                c = '~'; //it's an unar minus
                TokenB build = TokenB.build(c);
                stack.add(build);
                continue;
            };

            if( '-' == c || '+' == c || '/' == c || '*' == c) {
                //we need to pop all hirh-priority operators and operands OPERANDS from the stack;
                while(!stack.isEmpty() && TokenB.T.priority(c) <= stack.peek().type.priority)  {
                    result.add(stack.pop());
                }
                stack.push(TokenB.build(c));
                nextIsUnar = true; //at the end;
                continue;
            }
            if(' ' == c) {
                continue;
            }

            throw new UnsupportedOperationException("We don't support symbol: " + c);
        }

        if(!numberBuffer.isEmpty()) {
            result.add(TokenB.T.number.toToken(numberBuffer.toString()));
        }

        while(!stack.empty()) {//clear stack
            TokenB pop = stack.pop();
            if(pop.type != TokenB.T.openParenthesis) {
                result.add(pop);
            }
        }

        return result;
    }
}

class TokenB {
    public final T type;
    public final String value;

    public TokenB(T type, String value) {
        this.type = type;
        this.value = value;
    }

    public static TokenB build(char fromChar) {
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
        unarMinus('~', 20),
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

        public final TokenB toToken(String value) {
            return new TokenB(this, value);
        }

        public final TokenB toToken() {
            return new TokenB(this, null);
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
