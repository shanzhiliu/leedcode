package arrow_18;

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode after = new ListNode(0);
        ListNode result = after;
        after.next = head;
        ListNode pre = head;
        int cuIndex = 0;

        while (pre != null) {

            if(pre.val == val) {
                after.next = pre.next;
                break;
            }

            pre = pre.next;
            after = after.next;
            cuIndex++;

        }

        return result.next;
    }
}



