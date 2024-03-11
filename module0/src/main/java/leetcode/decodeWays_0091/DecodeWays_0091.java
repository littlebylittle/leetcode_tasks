package leetcode.decodeWays_0091;

public class DecodeWays_0091 {
    public int numDecodings(final String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        final int sLength = s.length();
        int accumulator = 1;
        int prev = 0;
        for (int i = 0; i < sLength; i++) {
            int newAccumulator = s.charAt(i) == '0' ? 0 : accumulator;
            //10 => '17' <= 26
            if(i!= 0  && (s.substring(i-1, i+1).compareTo("10") >= 0 && s.substring(i-1, i+1).compareTo("26") <= 0) ) { //so it's double digit between [10..26]
                newAccumulator = newAccumulator + prev;
            }
            prev = accumulator;
            accumulator = newAccumulator;
        }
        return accumulator;
    }
}
