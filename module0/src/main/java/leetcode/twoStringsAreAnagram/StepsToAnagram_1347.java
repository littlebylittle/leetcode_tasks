package leetcode.twoStringsAreAnagram;

public class StepsToAnagram_1347 {
    private static final byte[] sc = new byte[100_000];

    public int minSteps(String s, String t) {
        int[] counts = new int[128]; ;//e->101
        int n = s.length();
        s.getBytes(0, n, sc, 0);
        for (int i = n - 1; i >= 0; i--)  counts[sc[i]]--;
        t.getBytes(0, n, sc, 0);
        for (int i = n - 1; i >= 0; i--)  counts[sc[i]]++;
        int result = 0;
        for (int c = 'a'; c <= 'z'; c++)
                result += counts[c] > 0 ? counts[c]: -counts[c];
        return result/2;
    }
}
