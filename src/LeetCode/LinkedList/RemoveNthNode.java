package LeetCode.LinkedList;

/*


Beautiful solution to removing nth node
Two Pass algorithm (using two pointers)
 */

public class RemoveNthNode {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        ListNode l = removeNthFromEnd(listNode1, 2);
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p1 = dummy;
        ListNode p2 = dummy;

        for (int i = 0; i <= n ; i++) {
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;

        }

        p2.next = p2.next.next;
        return dummy.next;


    }
}

