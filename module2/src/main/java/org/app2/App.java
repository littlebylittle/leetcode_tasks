package org.app2;

import leetcode.coinChange_0322.CoinChange_0322;

import leetcode.deepestLeavesSum.DeepestLeavesSum_01302;
import prep.LiveLockExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World! "  + LiveLockExample.name);
        new CoinChange_0322().coinChange_naive2(new int[]{1,2,3}, 100);
        if(false) throw new RuntimeException("wut?");

        new HashMap<>(100, 0.8f);
        //nodes.maxSize == 10;
        // +el  size = 1;
        /**+el
         * +el
         * +el
         * +el
         *       size=7   ;  currentLoad = size/maxSize => 7/10 = 0.7
         *       size = 8 ;    8 / 10 => 0.8;   // => index 5;
         *       buckets = new array[bukcet.size * 2]
         *       budkets.size *= 2;
         *       100_000 => 100_000/0.8 => 100_000 * 5/ 4 = ~125_000 buckets
         *
         *   Compare complexity of inserting into and searching in a list and a hashtable.
         */

        //List<>(); // arrayList => [ ..     V ... . . . 100,  null, nul ,null]
        //LinkedList insert O(N)
        // ArrayCopy



    }
}
