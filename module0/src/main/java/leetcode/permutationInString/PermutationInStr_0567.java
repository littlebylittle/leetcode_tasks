package leetcode.permutationInString;

public class PermutationInStr_0567 {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] abc = new int[26];
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (char i = 0; i < chars1.length; i++) {
            abc[chars1[i]-'a']--;
        }
        for (char i = 0; i < chars2.length; i++) {
            abc[chars2[i]-'a']++;
        }
        for (int i = 0; i < 25; i++) {
            if(abc[i]<0) return false;
        }
        return true;


    }
}
