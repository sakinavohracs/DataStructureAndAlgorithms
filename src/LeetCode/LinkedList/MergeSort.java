package LeetCode.LinkedList;

public class MergeSort {

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


            ListNode listNode3=  new ListNode(6,null);
            ListNode listNode2 = new ListNode(5, listNode3);
            ListNode listNode1 = new ListNode(1,listNode2);


            ListNode listNode6=  new ListNode(4,null);
            ListNode listNode5 = new ListNode(2, listNode6);
            ListNode listNode4 = new ListNode(1,listNode5);

            ListNode listNode = mergeTwoLists(listNode1,listNode4);
            while(listNode!=null){
                System.out.println(listNode.val);
                listNode = listNode.next;
            }

            //mergeTwoLists()
        }



        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head = new ListNode();
            ListNode l3 = head;


            while (l1!=null || l2!=null){
                if(l1 == null){
                    l3.next = l2;
                    l2 = l2.next;
                }else if(l2==null) {
                    l3.next = l1;
                    l1 = l1.next;
                }
            if(l1.val < l2.val) {

                l3.next = l1;
                l1 = l1.next;


                }

            else {

                if(l2.next.val < l1.val) {
                    l3.next = l2;
                    l2 = l2.next;
                }
                else {
                    l3.next = l1;
                    l2 = l2.next;
                }

            }
        }
        return head.next;


    }
}
