package number_2;


import org.junit.Test;

public class SolutionTest {
    @Test
    public void  test1(){

        int[] l1 = new int[]{9,9,9,9,9,9,9};
        int[] l2 = new int[]{9,9,9,9};

        Solution.ListNode node1 = new Solution.ListNode(0);
        Solution.ListNode node1First = node1;
        Solution.ListNode node2 = new Solution.ListNode(0);
        Solution.ListNode node2First = node2;

        for (int value : l1) {

            Solution.ListNode node = new Solution.ListNode(value);
            node1.next = node;
            node1 = node;

        }

        for (int value : l2) {
            Solution.ListNode node = new Solution.ListNode(value);
            node2.next = node;
            node2 = node;
        }

        Solution solution = new Solution();
        Solution.ListNode listNode = solution.addTwoNumbers(node1First.next, node2First.next);

        while (listNode != null) {
            System.out.print(listNode.val + ",");
            listNode= listNode.next;
        }


    }





}
