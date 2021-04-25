package number_2;

class Solution {


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


        ListNode result = new ListNode(0);
        ListNode cuPoint = result;
        int carry = 0;

        while (l1 != null && l2 != null ) {
            int l1Value = l1.val;
            int l2Value = l2.val;
            int currentValue =  (l1Value + l2Value + carry) % 10;
            ListNode item = new ListNode(currentValue);
            carry =  (l1Value + l2Value + carry) / 10;
            cuPoint.next = item;
            cuPoint = item;

            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode lastNode = null;

        if(l1 != null) {
            lastNode = l1;

        } else if (l2 != null) {
            lastNode = l2;
        }

        while (lastNode != null) {
            int value = lastNode.val;
            int currentValue =  (value  + carry) % 10;
            ListNode item = new ListNode(currentValue);
            carry =  (value  + carry) / 10;
            cuPoint.next = item;
            cuPoint = item;
            lastNode = lastNode.next;
        }

        if(carry > 0) {
            ListNode item = new ListNode(carry);
            cuPoint.next = item;
        }

        return result.next;

    }
}



