package leetcode.mergeKSortedLists_0023;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }

        int sizeNonNull = moveNullsToRight(lists);
//        for (int i = 0; i < lists.length; i++) {
//            if(null != lists[i]) sizeNonNull++;
//        }

        if(sizeNonNull == 0) {
            return null;
        }
        final int margin = sizeNonNull;
        ListNode fakePointer = new ListNode();
        ListNode begin = fakePointer;
        while(sizeNonNull != lists.length) {
            ListNode head = lists[0];
            int minIndex = 0;
            for (int i = 0; i < lists.length-margin; i++) {
                final ListNode current = lists[i];
                if(current == null) {
                    continue;
                } else if (head == null) {
                    head = current;
                    minIndex = i;
                } else if (current.val < head.val) {
                    minIndex = i;
                    head = current;
                }
            }

            if(head.next == null) {
                sizeNonNull++;
            }
            begin.next = head;
            begin = head;
            head = head.next;
            lists[minIndex] = head;

        }

        return fakePointer.next;
    }

    private static int moveNullsToRight(ListNode[] nodeList) {
        int nullCount = 0;
        int length = nodeList.length;

        // Move null elements to the right
        for (int i = 0, j = 0; j < length; j++) {
            if (nodeList[j] != null) {
                // Swap non-null element to the left
                ListNode temp = nodeList[i];
                nodeList[i++] = nodeList[j];
                nodeList[j] = temp;
            } else {
                nullCount++;
            }
        }

        return nullCount;
    }

//    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
//        ListNode current = new ListNode(0);
//
//        while (l1 != null && l2 != null) {
//            if (l1.val < l2.val) {
//                current.next = l1;
//                l1 = l1.next;
//            } else {
//                current.next = l2;
//                l2 = l2.next;
//            }
//            current = current.next;
//        }
//        current.next = (l1 == null) ? l2 : l1;
//
//        return current.next;
//    }
}
