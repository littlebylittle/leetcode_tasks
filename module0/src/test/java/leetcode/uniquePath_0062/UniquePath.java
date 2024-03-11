package leetcode.uniquePath_0062;

public class UniquePath {
    public int uniquePaths(int m, int n) {
        if(m == 1 || n == 1) {
            return 1;
        }
        var a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0) {
                    a[i][j] = 1;
                    continue;
                }
                if(j == 0) {
                    a[i][j] = 1;
                    continue;
                }
                a[i][j] = a[i-1][j] + a[i][j-1];
            }
        }

        return a[m-1][n-1];
    }
}
