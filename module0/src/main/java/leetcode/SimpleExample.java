package leetcode;

import org.slf4j.Logger;

import java.util.*;


public class SimpleExample {
    void someExample() {

        Queue<Integer> d = new ArrayDeque<Integer>();
        d.add(1);

        while (!d.isEmpty()) {
            var el = d.poll();
            d.add(el + 2);
            d.add(el + 4);
            System.out.println("" + el);
            if(d.size() > 1000) {
                System.out.println("end i'm exhausted");
                d.clear();
                break;
            }
        }

    }
}
