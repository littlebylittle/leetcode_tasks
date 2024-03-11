package leetcode;

public class ValidAnagram_0242 {
    public boolean isAnagram(String left, String right) {
        // Calculate frequency of characters in string p
        if(left.length() != right.length()) {
            return false;
        }
        int[] count = new int[26]; // Assuming lowercase English letters only

        char[] leftBytes = left.toCharArray();
        char[] rightBytes = right.toCharArray();

        int length = left.length();
        for (int i = 0; i < length; i++) {
            count[leftBytes[i] - 'a']++;
            count[rightBytes[i] - 'a']--;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]!=0) return false;
        }

        return true;
    }
}
