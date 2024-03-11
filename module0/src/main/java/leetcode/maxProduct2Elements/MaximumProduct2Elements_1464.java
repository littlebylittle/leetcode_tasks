package leetcode.maxProduct2Elements;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MaximumProduct2Elements_1464 {
    public int maxProduct_naive(int[] nums) {
        //queuePiriotity(MAX1, MAX2)
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(nums);

//        int el1 = pq.poll();
//        int el2 = pq.poll();

        int el1= nums[nums.length-1];
        int el2 = nums[nums.length-2];
        return (el1-1)*(el2 -1 );

    }

    public int maxProduct_fasta(int[] nums) {
        int predMax = nums[0];
        int maxMax = nums[1];
        //[1,   2, 3,  4, 5, 6] ;   1,2 (3) ======== (1) => (2); max => (3)
        /*     b^  a..........
                   a^

          [6, 7,  9, 9];     7->9;  6-7;
         */
        if(predMax > maxMax) { //swap
            predMax = nums[1];
            maxMax = nums[0];
        }

        for (int i = 2; i < nums.length; i++) {
            if(nums[i] > maxMax) {
                predMax = maxMax;
                maxMax = nums[i];
            } else
            if(nums[i] > predMax) { //predMax[index] =!= maxMax[index]
                predMax = nums[i];
            }
        }

        return (predMax-1)*(maxMax -1 );
    }


    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            return -Integer.compare(o1, o2);
        });
        for (Integer i : nums) {
            pq.add(i);
        }
        /*
             5
            3 4
         */
        int el1 = pq.poll();
        int el2 = pq.poll();
        return (el1-1)*(el2 -1 );
    }
}
