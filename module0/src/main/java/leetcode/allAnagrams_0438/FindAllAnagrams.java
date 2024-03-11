package leetcode.allAnagrams_0438;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
    public List<Integer> findAnagrams(String s/*longStr*/, String p) {
        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() == 0 || p == null || p.length() == 0 || s.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26]; // Assuming lowercase English letters only
        int[] sCount = new int[26];

        // Calculate frequency of characters in string p
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }

        int pLength = p.length();
        int sLength = s.length();
        int left = 0, right = 0;

        // Sliding window approach to check anagrams
        while (right < sLength) {
            // Expand the window by including the current character at 'right'
            sCount[s.charAt(right) - 'a']++;

            // If the window size is equal to p's length, compare character counts
            if (right - left + 1 == pLength) {
                if (Arrays.equals(pCount, sCount)) {
                    result.add(left);
                }
                // Slide the window by decrementing the count of left character
                sCount[s.charAt(left) - 'a']--;
                left++;
            }

            right++;
        }

        return result;
    }
}
