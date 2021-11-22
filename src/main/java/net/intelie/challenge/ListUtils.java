package net.intelie.challenge;

public class ListUtils {

    public static ListNode createListFromInts(int... nodes) {
        ListNode head, aux;
        head = aux = null;
        //sort(nodes);
        for (int node : nodes) {
            if (head == null) {
                head = aux = new ListNode(node);
            } else {
                aux.next = new ListNode(node);
                aux = aux.next;
            }
        }
        return head;
    }


    public static ListNode createListWithSize(int size) {
        ListNode head = new ListNode(0);
        ListNode aux = head;
        for (int i = 1; i < size; i++) {
            aux.next = new ListNode(i);
            aux = aux.next;
        }
        return head;
    }

    public static int listSize(ListNode listNode) {
        int count = 0;
        while (listNode != null) {
            count++;
            listNode = listNode.next;
        }
        return count;
    }
}
