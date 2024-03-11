package leetcode.coinChange_0322;

import java.util.LinkedList;
import java.util.Queue;

public class CoinChange_0322DP {
    public int coinChange(final int[] coins, final int amount) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int coninsCount = 0;
        boolean[] memoisationVisited = new boolean[amount + 1];
        while (!q.isEmpty()) {
            int queueSize = q.size();
            for (int i = 0; i < queueSize; i++) {
                @SuppressWarnings("DataFlowIssue")
                final int sum = q.poll();
                if (sum == amount) {
                    return coninsCount;
                }
                if (sum > amount || memoisationVisited[sum]) {
                    continue;
                }
                memoisationVisited[sum] = true;
                for (int coin : coins) {
                    q.add(sum + coin);
                }
            }
            coninsCount++;
        }
        return -1;
    }
}
