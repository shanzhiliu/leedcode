package number_104;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution {
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode,Integer>  levelMap = new HashMap<>();
        Integer maxLevel = 1;

        TreeNode currentNode = root;
        queue.add(currentNode);
        levelMap.put(currentNode,1);

        while (queue.size() != 0) {
            //队列前,取出node,队列后加入node的孩子节点
            currentNode = queue.poll();
            //获取当前节点的层级
            Integer  cuLevel = levelMap.get(currentNode);

            if(cuLevel > maxLevel) {
                maxLevel = cuLevel;
            }

            TreeNode left = currentNode.left;
            TreeNode right = currentNode.right;

            if(left != null) {
                queue.add(currentNode.left);
                levelMap.put(left, cuLevel + 1);
            }

            if(right != null) {
                queue.add(currentNode.right);
                levelMap.put(right, cuLevel + 1);
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

        Solution solution = new Solution();

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