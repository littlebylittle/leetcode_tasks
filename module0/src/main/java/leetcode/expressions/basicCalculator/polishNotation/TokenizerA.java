package leetcode.expressions.basicCalculator.polishNotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TokenizerA { //or tokenizer?
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
            //flush numberBuffer is it's not empty; ? maybe other buffers?
            if(! numberBuffer.isEmpty()) {
                result.add(TokenB.T.number.toToken(numberBuffer.toString()));
                numberBuffer = new StringBuilder();
                nextIsUnar = false;

                //pop all unary operations?
                while(!stack.empty() && stack.peek().type == TokenB.T.unarMinus ) {
                    result.add(stack.pop());
                }
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
            if( ' ' == c) {
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
            throw new UnsupportedOperationException("We don't support symbol: " + c);
        }
        if(!numberBuffer.isEmpty()) {
            result.add(TokenB.T.number.toToken(numberBuffer.toString()));
            numberBuffer = new StringBuilder();
            nextIsUnar = false;
        }

        while(!stack.empty()) {//clear stack
            TokenB pop = stack.pop();
            if(pop.type != TokenB.T.openParenthesis) {
                result.add(pop);
            }
        }

        return result;
    }

    static final class ParseException extends RuntimeException {
        public ParseException(String message) {
            super(message);
        }
    }
}
