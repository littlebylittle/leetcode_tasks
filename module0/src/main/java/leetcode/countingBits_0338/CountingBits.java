package leetcode.countingBits_0338;

public class CountingBits {
    public int[] countBits(int n) {
        if(n == 0) {
            return new int[] {0};
        }
        if(n == 1) {
            return new int[] {0, 1};
        }

        int[] z = new int[n+1];
        z[0] = 0;
        z[1] = 1;
        int start = 2; // border starts
        int end = 3; //border ends

        int i = start;
        while(i < n+1) {
            for (; i<=end && i<=n ; i++) {
                z[i] = 1 + z[i-start];
            }
            start = end + 1;
            end = (start * 2) - 1;
        }

        return z;
    }
}
