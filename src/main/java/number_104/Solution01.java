package number_104;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution01 {
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        Integer maxLevel = 0;
        queue.add(root);

        while (queue.size() != 0) {

            maxLevel ++;

            Integer nodeCount = queue.size();
            //把这一层都给搞出去
            for (int i = 0; i < nodeCount; i++) {
                TreeNode currentNode =  queue.poll();
                TreeNode left = currentNode.left;
                TreeNode right = currentNode.right;

                if(left != null) {
                    queue.add(currentNode.left);
                }

                if(right != null) {
                    queue.add(currentNode.right);
                }

            }
        }
        return maxLevel;
    }

    public static void main(String[] args) {

        TreeNode t6 = new TreeNode(6,null,null);
        TreeNode t7 = new TreeNode(7,null,null);

        TreeNode t4 = new TreeNode(4,null,t7);
        TreeNode t5 = new TreeNode(5,null,null);

        TreeNode t2 = new TreeNode(2,t4,t5);
        TreeNode t3 = new TreeNode(3,t6,null);

        TreeNode t1 = new TreeNode(1,t2,t3);

        Solution01 solution = new Solution01();

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