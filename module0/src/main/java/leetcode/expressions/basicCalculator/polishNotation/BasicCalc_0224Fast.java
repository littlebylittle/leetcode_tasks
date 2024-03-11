package leetcode.expressions.basicCalculator.polishNotation;

public class BasicCalc_0224Fast {
    private int index;

    public int calculate(String s) {
        index = 0;
        return calc(s.toCharArray());
    }

    private int calc(char[] sarr) {
        int sum = 0;
        int nextSign = 1;

        while (index < sarr.length) {
            switch (sarr[index]) {
                case ' ' -> {
                }
                case '+' -> nextSign = 1;
                case '-' -> nextSign = -1;
                case '(' -> {
                    index++;
                    sum += nextSign * calc(sarr);
                }
                case ')' -> {
                    return sum;
                }
                default -> { //digits
                    int number = sarr[index] - '0';
                    while (index + 1 < sarr.length && sarr[index + 1] >= '0') {
                        index++;
                        number = number * 10 + (sarr[index] - '0');
                    }
                    sum += (nextSign * number);
                }
            }
            index++;
        }
        return sum;

    }
}
