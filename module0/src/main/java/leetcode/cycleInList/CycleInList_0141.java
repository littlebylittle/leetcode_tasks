package leetcode.cycleInList;

public class CycleInList_0141 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        while(fast != null && fast.next != null) { //fast will be checked always at least once, the second pointer will have the same values later;
            fast = fast.next.next;
            head = head.next;

            if(head == fast) {
                return true;
            }
        }
        return false;
    }
}
