package number_2;

import java.util.List;

class Solution1 {


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head = new ListNode(0);
        ListNode result = head;

        int carryValue = 0;

        while (l1 != null || l2 != null) {

            int value1 = 0;
            int value2 = 0;

            if (l1 != null) {
                value1 = l1.val;
                l1=l1.next;
            }

            if (l2 != null) {
                value2 = l2.val;
                l2=l2.next;
            }

            int target =  (value1 + value2 + carryValue) % 10;
            carryValue = (value1 + value2 + carryValue) / 10;

            ListNode temp = new ListNode(target);
            head.next = temp;
            head=head.next;
        }

        if(carryValue > 0) {
            ListNode temp = new ListNode(carryValue);
            head.next = temp;
        }

        return result.next;
    }
}



