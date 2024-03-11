package leetcode.mergeKSortedLists_0023;

public class ParseUtils {

    public static ListNode[] parseInput(String input) {
        // Remove brackets and split by commas
        String substring = input.substring(1, input.length() - 1);
        String[] elements = substring.split("\\],\\[");

        ListNode[] result = new ListNode[elements.length];

        for (int i = 0; i < elements.length; i++) {
            String element = elements[i].replaceAll("\\]", "").replaceAll("\\[", "");
            result[i] = parseListNode(element);
        }

        return result;
    }

    private static ListNode parseListNode(String element) {
        // If element is empty, return null
        if (element.isEmpty()) {
            return null;
        }

        // Split by commas and parse integers
        String[] values = element.split(",");
        ListNode head = new ListNode(Integer.parseInt(values[0]));
        ListNode current = head;

        // Create the linked list
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(Integer.parseInt(values[i]));
            current = current.next;
        }

        return head;
    }
}
