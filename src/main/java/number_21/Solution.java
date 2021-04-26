package number_21;

class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode currentPoint = result;
        while (l1 != null && l2 !=null) {

            int top = l1.val;
            int bottom = l2.val;

            if(top >= bottom) {
                ListNode itemNode = new ListNode(bottom);
                l2 = l2.next;
                currentPoint.next = itemNode;
                currentPoint = itemNode;
            } else {
                ListNode itemNode = new ListNode(top);
                l1 = l1.next;
                currentPoint.next = itemNode;
                currentPoint = itemNode;
            }
        }

        ListNode lastNode = null;
        if (l2 != null) {
            lastNode = l2;
        }
        if (l1 != null) {
            lastNode = l1;
        }
        while (lastNode != null) {
            ListNode itemNode = new ListNode(lastNode.val);
            lastNode = lastNode.next;
            currentPoint.next = itemNode;
            currentPoint = itemNode;
        }

        return result.next;
    }
}