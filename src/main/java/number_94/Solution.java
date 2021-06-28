package number_94;


import java.util.*;

//*
// * Definition for a binary tree node.
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        Map<TreeNode,Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cuTree = root;

        while ( cuTree != null || !stack.isEmpty()) {

            while (cuTree != null) {
                //第一次
                if(countMap.get(cuTree) == null) {
                    countMap.put(cuTree,1);
//                    result.add(cuTree.val);
                }

                stack.push(cuTree);
                cuTree = cuTree.left;
            }

            cuTree = stack.peek();

            //第三次,拿出来的值是2
            while (countMap.get(cuTree) == 2) {
//                result.add(cuTree.val);
                if(stack.isEmpty()) {
                    break;
                }
                cuTree = stack.pop();
            }

            //第二次,拿出来的值是1
            if(countMap.get(cuTree) == 1) {
                countMap.put(cuTree,2);
                result.add(cuTree.val);
            }

            cuTree = cuTree.right;

        }

        return result;

    }

    public static void main(String[] args) {
        TreeNode t3 = new TreeNode(3,null,null);

        TreeNode t2 = new TreeNode(2,t3,null);

        TreeNode t1 = new TreeNode(1,null,t2);

        Solution solution = new Solution();
        List<Integer> list = solution.inorderTraversal(t1);

        list.stream().forEach(s -> System.out.println(s));
    }
}