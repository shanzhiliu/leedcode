package number_19;

import javax.xml.soap.Node;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode after = new ListNode(0);
        ListNode result = after;
        after.next = head;

        ListNode pre = head;
        for (int i = 0; i < n && head != null; i++) {
             pre = pre.next;
        }

        while (pre != null) {
            pre = pre.next;
            after = after.next;
        }

        after.next = after.next.next;

        return result.next;
    }
}