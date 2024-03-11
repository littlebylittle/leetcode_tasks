package leetcode.reorderList;

import java.util.Stack;

public class ReorderList_0143 {

    //expected  1->4->2->3
    //head =//1->2->3->4
    //while stack.pop => 4, 3 ,2 ,1
    //var next = 1.next => (2); res.push(1);
    //res.push(stack.pop) => res == 1, 4;   stack(3, 2, 1)

    //var next = 2.next => (3); res.push(2);  res => 1, 4, 2
    //res.push(stack.pop) => res 1, 4, 2, 3 ;   stack (2, 1)

    //1 2 3 4 5
    //1 5 2 4 3

    public void reorderList(ListNode head) {
        //1->2->3->4 =====> 1->4->2->3
        //1->2->3 ->4-> 5->6->7 ====> 1->7 -> 2->6 -> 3->5 -> 4

        //so we need to have an referenct cursor element, that will be moving to the right
        //and java stack pops element from the end

        if (head.next == null) {
            return;
        }
        Stack<ListNode> stack = new Stack<>();
        var current = head;
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        int maxElements = stack.size(); //5
        ListNode tempo;
        for (int i = 0; i < maxElements / 2; i++) {
            tempo = head.next;
            head.next = stack.pop();
            head.next.next = tempo;
            head = tempo;
        }
        head.next = null;
    }

}
