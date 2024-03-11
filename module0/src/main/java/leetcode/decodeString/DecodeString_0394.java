package leetcode.decodeString;

import java.util.Stack;

public class DecodeString_0394 {
    public String decodeString(String s) { //"3[a2[c]]" => 3*acc=> acc acc acc => accaccacc (always valid)
        char[] chars = s.toCharArray();
        StringBuilder sbHead = new StringBuilder();
        int count = 0;
        Stack<StringBuilder> sbStack = new Stack<>();
        sbStack.push(sbHead);
        Stack<Integer> repetition = new Stack<>();
        repetition.push(1);
        for (int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i])) {
                count = count*10+Character.digit(chars[i], 10);
                continue;
            }
            if('[' == chars[i]) {
                repetition.push(count);
                count = 0;
                sbHead = new StringBuilder();
                sbStack.push(sbHead);
                continue;
            }
            if(']' == chars[i]) {
                String pop = sbStack.pop().toString();
                int howMany = repetition.pop();
                count = 0;
                sbHead = sbStack.peek();
                for (int j = 0; j <= howMany - 1; j++) {
                    sbHead.append(pop);
                }
                continue;
            }
            //other symbols
            count = 0;
            sbHead.append(chars[i]);
        }
        repetition.pop();
        return sbStack.pop().toString();
    }
}
