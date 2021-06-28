package number_145;


import java.util.*;

//*
// * Definition for a binary tree node.
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        Map<TreeNode,Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cuTree = root;

        while ( cuTree != null || !stack.isEmpty()) {



            //第一次
            if(cuTree != null  && countMap.get(cuTree) == null) {
//                result.add(cuTree.val);
                countMap.put(cuTree,1);
                stack.push(cuTree);
                cuTree = cuTree.left;
            }
            else {

                cuTree = stack.peek();
                //第二次
                if(countMap.get(cuTree) == 1) {
//                 result.add(cuTree.val);
                    countMap.put(cuTree,2);
                    cuTree = cuTree.right;
                }
                //第三次
                else {
                    result.add(cuTree.val);
                    cuTree = stack.pop();
                    if(stack.isEmpty()) {
                        return result;
                    }

                }

            }


        }

        return result;

    }

    public static void main(String[] args) {
        TreeNode t3 = new TreeNode(3,null,null);

        TreeNode t2 = new TreeNode(2,t3,null);

        TreeNode t1 = new TreeNode(1,null,t2);

        Solution solution = new Solution();
        List<Integer> list = solution.postorderTraversal(t1);

        list.stream().forEach(s -> System.out.println(s));
    }
}