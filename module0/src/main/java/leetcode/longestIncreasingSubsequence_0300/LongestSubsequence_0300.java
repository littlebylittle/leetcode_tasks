package leetcode.longestIncreasingSubsequence_0300;

public class LongestSubsequence_0300 {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
                        //here we keep sequence in the ordered state
                        //also see longestSequence variable, that keeps info when the longest sequence was reached
        /* COMMENT ME/Arrays.fill(tails, Integer.MIN_VALUE); //just for the convinient debuging purpose, COMMENT ME/**/
        int longestSequence = 0; //how many numbers in the tails were added in tails;
        for (int value : nums) {
            int left = 0, right = longestSequence; //indexes in the tails
            while (left < right) { //in a cycle moving our index-pointers to the (left==x==>middle+1, middle <===x==right), until pointers
                int middle = (left + right) / 2; //e.g.  (100 + 101)/2 == 100; so at one moment left pointer will be eq middle
                if (tails[middle] < value)
                    left = middle + 1;          //and left just become slightly greater
                else
                    right = middle;             // of we just move right to the middle (where is already left)
                                                //if we change right-ptr, means that we will replace values in the TAILS
            }
            tails[left] = value; //breakpoint here
            if (left == longestSequence) {
                longestSequence++; //breakpoint here
            }
        }
        return longestSequence;
    }


    /**
     *   {100, 200, 300, 1, 2, 3, 4, 5, 6}); //3!? =, 6                         ^    .. .. . .. .
     *     value .. . .
     *
     * cuurent
     *  tails new array[8] = [[1, 2, 3, 4,  5,  16, 17], 0, 0, 0, 0, ]  <===5?
     *                                      R
     *  left = 0,                           L
     *  right =4 ;
     *  left, right, maxLengthTails = 6
     *
     *  return 6;

     */
}
