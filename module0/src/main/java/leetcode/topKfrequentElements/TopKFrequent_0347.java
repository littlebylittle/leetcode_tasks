package leetcode.topKfrequentElements;

import java.util.*;

public class TopKFrequent_0347 {
    public int[] topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();

        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        int[] res = new int[k];

        int i = 0;
        for (int pos = bucket.length - 1; pos >= 0 && i < k; pos--) {
            if (bucket[pos] == null) {
                continue;
            }

            for (int j = 0; j < bucket[pos].size() && i < k; j++) {
                res[i] = bucket[pos].get(j);
                i++;
            }
        }
        return res;
    }
}
