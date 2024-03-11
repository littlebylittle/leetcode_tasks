package leetcode.sortCharactersByFreq;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class SortByFrequency_0451 {
//    public String frequencySort(String s) {
//        final Map<Character, Integer> map = new HashMap<>();
//        char[] chars = s.toCharArray();
//
//        for (char aChar : chars) {
//            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
//        }
//        StringBuilder sb = new StringBuilder();
//        s.chars().mapToObj(el -> (char) el)
//                .sorted(Comparator.comparing(map::get, Comparator.reverseOrder()) )
//                .forEach(sb::append);
//
//        return sb.toString();
//    }

    //    public String frequencySort(String s) {
//        final Map<Character, Integer> map = new HashMap<>();
//        char[] chars = s.toCharArray();
//
//        for (char aChar : chars) {
//            map.put(aChar, map.getOrDefault(aChar, 0) + 1);
//        }
//        StringBuilder sb = new StringBuilder();
//        s.chars().mapToObj(el -> (char) el)
//                .sorted(Comparator.comparing(map::get, Comparator.reverseOrder())
//                        .thenComparing((a,b)-> {
//                            Character aChar = (Character)a;
//                            Character bChar = (Character)b;
//                            return Character.compare(aChar.charValue(),bChar.charValue());
//                        } ))
//                .forEach(sb::append);
//
//        return sb.toString();
//    }
    public String frequencySort(String s) {
        char[] arr = s.toCharArray();
        int[] counts = new int[128];
        for (int i = 0; i < arr.length; ++i)
            counts[arr[i]]++;

        for (int pos = 0; pos < arr.length; ) {
            int cmax = 0;
            for (char i = 0; i < counts.length; ++i)
                if (counts[i] > counts[cmax]) cmax = i;

            while (counts[cmax]-- > 0)
                arr[pos++] = (char) cmax;
        }

        return new String(arr);
    }
}
