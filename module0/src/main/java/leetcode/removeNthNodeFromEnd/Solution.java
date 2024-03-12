package leetcode.removeNthNodeFromEnd;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, final int n) {
        ListNode fakeHead = new ListNode(999);
        fakeHead.next = head;
        recurssion(fakeHead, n);
        return fakeHead.next;
    }

    public int recurssion(ListNode currentNode, final int requiredLevel) {
        if(currentNode == null) {
            return 1;
        }
        int result = recurssion(currentNode.next, requiredLevel);
        if(result-1 == requiredLevel) {
            if(currentNode.next !=null) {
                currentNode.next = currentNode.next.next;
            }
            return requiredLevel+2;
        }
        return result+1;
    }
}
