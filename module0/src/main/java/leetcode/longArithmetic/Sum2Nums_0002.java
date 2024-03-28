package leetcode.longArithmetic;

public class Sum2Nums_0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            tail.next = new ListNode(digit);
            tail = tail.next;

            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }
}
