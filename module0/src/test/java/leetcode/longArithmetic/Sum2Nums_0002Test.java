package leetcode.longArithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sum2Nums_0002Test {
    @Test
    void name00() {
        //89992
        //1
        var left = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(2)))));
        var right = new ListNode(1);
        ListNode result = new Sum2Nums_0002().addTwoNumbers(left, right);
        assertEquals(result.val, 9);
        StringBuilder sb = new StringBuilder();
        recursiveTraverse(result, sb);
        // 1___
        // +
        // 89992
        // 99992 and reverse
        // 29999
        assertEquals(sb.toString(), "29999");
    }

    @Test
    void name02() {
        //89992
        //1
        var left = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(2)))));
        var right = new ListNode(9);
        ListNode result = new Sum2Nums_0002().addTwoNumbers(left, right);
        StringBuilder sb = new StringBuilder();
        recursiveTraverse(result, sb);
        // 9____
        // +
        // 89992
        // =
        // 8+9 =>       7   ([1]7) move to the next
        //  1+9=>       0   ([1]0) move to the next
        //   1+9=>      0   ([1] move to the next
        //       1+9=>  0  ([1] move to the next
        //         1+2 =3
        //     70003 and reverse 30007
        // 99992 and reverse
        assertEquals(sb.toString(), "30007");
    }

    @Test
    void name_hint() {
        assertEquals(10009998, 9_999_999 + 9_999);
        /**
         *  9999_999
         *  +
         *  9999
         *
         */
        var left = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9
        )))))));
        var right = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode result = new Sum2Nums_0002().addTwoNumbers(left, right);
        StringBuilder sb = new StringBuilder();
        recursiveTraverse(result, sb);
        assertEquals("10009998", sb.toString());

    }

    static void recursiveTraverse(ListNode n, StringBuilder sb) {
        if(n == null) {
            return;
        }
        recursiveTraverse(n.next, sb);
        sb.append(n.val);
    }
}