package number_104;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution02 {
    public int maxDepth(TreeNode root) {
        return getMaxDeep(root);
    }

    private int getMaxDeep(TreeNode node) {
        if(node == null) return 0;
        int leftLevel = maxDepth(node.left);
        int rightLevel = maxDepth(node.right);
        return Math.max(leftLevel,rightLevel) + 1;
    }


    public static void main(String[] args) {

        TreeNode t6 = new TreeNode(6,null,null);
        TreeNode t7 = new TreeNode(7,null,null);

        TreeNode t4 = new TreeNode(4,null,t7);
        TreeNode t5 = new TreeNode(5,null,null);

        TreeNode t2 = new TreeNode(2,t4,t5);
        TreeNode t3 = new TreeNode(3,t6,null);

        TreeNode t1 = new TreeNode(1,t2,t3);

        Solution02 solution = new Solution02();

        System.out.println(solution.maxDepth(t1));

    }



/**
 *           t1
 *      t2        t3
 *  t4     t5   t6
 *    t7
 * @param args
 */
/**
 *
 */
}