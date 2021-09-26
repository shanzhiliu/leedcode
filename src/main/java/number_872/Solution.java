package number_872;

import util.TreeNode;
import util.TreeNodeUtil;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        traveTreeNode(root1,list1);
        List<Integer> list2 =  new ArrayList<>();
        traveTreeNode(root2,list2);

        return compareList(list1,list2);
    }

    private boolean compareList(List<Integer> list1, List<Integer> list2) {
        if(list1 == null && list2 == null) return true;
        if(list1 == null || list2 == null) return false;
        if(list1.size() != list2.size()) return false;

        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i) != list2.get(i)) return false;
        }

        return true;
    }

    private void traveTreeNode(TreeNode node, List<Integer> list) {
        if(node == null) return;

        if(node.left == null && node.right == null) {
            list.add(node.val);
        }
        traveTreeNode(node.left,list);
        traveTreeNode(node.right,list);

    }

    public static void main(String[] args) {

        TreeNode left6 = new TreeNode(6,null,null);
        TreeNode left7 = new TreeNode(7,null,null);
        TreeNode left4 = new TreeNode(4,null,null);
        TreeNode left9 = new TreeNode(9,null,null);
        TreeNode left8 = new TreeNode(8,null,null);

        TreeNode left2 = new TreeNode(2,left7,left4);
        TreeNode left1 = new TreeNode(1,left9,left8);
        TreeNode left5 = new TreeNode(5,left6,left2);
        TreeNode left3 = new TreeNode(3,left5,left1);



        TreeNode right6 = new TreeNode(6,null,null);
        TreeNode right7 = new TreeNode(7,null,null);
        TreeNode right4 = new TreeNode(4,null,null);
        TreeNode right9 = new TreeNode(9,null,null);
        TreeNode right8 = new TreeNode(8,null,null);

        TreeNode right2 = new TreeNode(2,right9,right8);
        TreeNode right1 = new TreeNode(1,right4,right2);
        TreeNode right5 = new TreeNode(5,right6,right7);
        TreeNode right3 = new TreeNode(3,right5,right1);

        TreeNode left = TreeNodeUtil.getRootNode(new Integer[]{3,5,1,6,2,9,8,null,null,7,4});
        TreeNode right = TreeNodeUtil.getRootNode(new Integer[]{3,5,1,6,7,4,2,null,null,null,null,null,null,9,8});

        Solution solution = new Solution();
        System.out.println(solution.leafSimilar(left,right));

    }


}