package leetcode.coinChange_0322;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinChange_0322DPTest {
//    @Test
//    void queue_test() {
//        Queue<String> q = new LinkedList<>();
//        var list = IntStream.concat(IntStream.range(0, 50), IntStream.range(-200, -5)).boxed().toList();
//        var list2 = new ArrayList<>();
//        list.forEach(el -> {
//            q.add(el.toString());
//            list2.add(el);
//        });
//        var sb = new StringBuilder();
//        boolean first = true;
//
//        while(!q.isEmpty()) {
//            var el = q.poll();
//            if(first) {
//                sb.append(el);
//                first = false;
//            } else {
//                sb.append(", ").append(el);
//            }
//        }
//        log.info("list2:{}", list2);
//        Assertions.assertEquals("", sb.toString());
//
//    }


    @Test
    void namexxx() {
        int i = new CoinChange_0322DP().coinChange(new int[]{5, 7, 15, 10}, 50);//15,15,10,10 or 15,15,15,5
        assertEquals(4, i);
    }

    @Test
    void test_simple() {
        int i = new CoinChange_0322DP().coinChange(new int[]{1,2}, 4);//2,2 -> count==2
        assertEquals(2, i);
    }

    @Test
    void test_99() {
        int i = new CoinChange_0322DP().coinChange(new int[]{1,100}, 99);
        assertEquals(99, i);
    }

    @Test
    void test_99_scenario_2() {
        int i = new CoinChange_0322DP().coinChange(new int[]{1,49,100}, 99); // 49+49+1 ==count 3
        assertEquals(3, i);
    }
}