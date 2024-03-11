package leetcode.coinChange_0322;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CoinChange_0322 {
    public int coinChange_naive2(final int[] coins, int amount) {
        System.out.println("Searching: " + amount);
        List<Integer> coinsList = Arrays.stream(coins).boxed().distinct().collect(Collectors.toList());
        return rec(coinsList, amount, List.of(new Entry(0, -1, null)));
    }
    public int rec(final List<Integer> coins, int amount, List<Entry> levels) {
        if(amount<0) return -1;
        if(amount==0) return 0;
        System.out.println("level: " + levels + " ͼ=" + amount + "; $:" + coins);
        int cc=-1;
        for(int i=0;i<coins.size();i++) {
                var copy = new ArrayList<>(levels);
                copy.add(new Entry(copy.get(copy.size()-1).level + 1, i, coins.get(i) ));
            int coin= rec(coins, amount-coins.get(i), copy);
            if(coin>=0 && cc <0 ) {
                cc=coin+1;
            } else if(coin>=0 /*&& cc >=0/**/) {
                cc = Math.min(cc,coin+1);
            }
        }
        return cc;
    }

    static class Entry {
        final int level;
        final int iteration ;

        final Integer deleted;

        public Entry(int level, int iteration, Integer deleted) {
            this.level = level;
            this.iteration = iteration;
            this.deleted = deleted;
        }

        @Override
        public String toString() {
            if(iteration < 0) return "";
            return /*"#>" + level +*/
                    "i=" + iteration + ((deleted == null)?"": ",x="+deleted);
        }
    }
}
