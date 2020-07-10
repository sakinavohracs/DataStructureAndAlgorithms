package LeetCode.LinkedList;



public class AdditionLinkedlist {

    public static class ListNode{

        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

    public static void main(String[] args) {
        ListNode listNode3=  new ListNode(3,null);
        ListNode listNode2 = new ListNode(4, listNode3);
        ListNode listNode1 = new ListNode(2,listNode2);


        ListNode listNode6=  new ListNode(4,null);
        ListNode listNode5 = new ListNode(6, listNode6);
        ListNode listNode4 = new ListNode(5,listNode5);

        ListNode l = getAdditon(listNode1,listNode4);
        ListNode prev = null;

        while(l!=null){


            ListNode next_node = l.next;
            l.next = prev;
            prev = l;
            l = next_node;



        }

        while(prev!=null){
            System.out.println(prev.val);
            prev= prev.next;

        }



    }




    public static ListNode getAdditon(ListNode l1, ListNode l2) {

        int carry=0;
        ListNode curr = new ListNode(0);
        ListNode listNode;
        listNode = curr;

        while(l1!=null || l2!=null) {

            int x = l1 != null ? l1.val : 0;
            int y = l2 != null ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            listNode.next = new ListNode(sum % 10);
            listNode = listNode.next;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;

        }

        if (carry > 0) {
            listNode = new ListNode(carry);
        }

        return curr.next;
        }

//        ListNode dummyHead = new ListNode(0);
//        ListNode p = l1, q = l2, curr = dummyHead;
//        int carry = 0;
//        while (p != null || q != null) {
//            int x = (p != null) ? p.val : 0;
//            int y = (q != null) ? q.val : 0;
//            int sum = carry + x + y;
//            carry = sum / 10;
//            curr.next = new ListNode(sum % 10);
//            curr = curr.next;
//            if (p != null) p = p.next;
//            if (q != null) q = q.next;
//        }
//        if (carry > 0) {
//            curr.next = new ListNode(carry);
//        }
//        return dummyHead.next;
//    }

    }

