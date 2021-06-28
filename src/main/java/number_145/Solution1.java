package number_145;


import java.util.*;

//*
// * Definition for a binary tree node.
class Solution1 {
    public List<Integer> postorderTraversal(TreeNode root) {

        Map<TreeNode,Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode cuTree = root;

        while ( cuTree != null || !stack.isEmpty()) {

            //如果是悬崖返回上层节点
            if(cuTree == null) {
                cuTree = stack.peek();
            }

            //第一次,向左出发
            if(countMap.get(cuTree) == null) {
//                result.add(cuTree.val);
                countMap.put(cuTree,1);
                stack.push(cuTree);
                cuTree = cuTree.left;
            }
            //第二次,向右出发
            else if(countMap.get(cuTree) == 1) {
//                 result.add(cuTree.val);
                countMap.put(cuTree,2);
                cuTree = cuTree.right;
            }
            //第三次,返回到上层节点.
            else  if(countMap.get(cuTree) == 2){
                result.add(cuTree.val);
                cuTree = stack.pop();

                //是否有上层节点
                if(!stack.isEmpty()) {
                    //返回上层节点
                    cuTree = stack.peek();
                }
                //遍历完了,就结束了
                else {
                    return result;
                }
            }

        }

        return result;

    }

    public static void main(String[] args) {
        TreeNode t3 = new TreeNode(3,null,null);

        TreeNode t2 = new TreeNode(2,t3,null);

        TreeNode t1 = new TreeNode(1,null,t2);

        Solution1 solution = new Solution1();
        List<Integer> list = solution.postorderTraversal(t1);

        list.stream().forEach(s -> System.out.println(s));
    }
}






//前序 根---左---右
/**
 *           t1
 *      t2        t3
 *  t4     t5   t6
 *    t7
 * @param args
 */
/**
 * 前序规则
 * 1. 第一次到达一个节点,记录这个节点的名称,然后向左出发
 * 2. 当走到悬崖(null)时,不记录,回到父节点
 * 3. 第二次到达一个节点,不记录,并向右出发
 * 4. 第三次到达一个节点,不记录,回到父节点
 *
 * 第一次到达t1,记录{t1,},向左出发
 * 第一次到达t2,记录{t1,t2},向左出发
 * 第一次到达t4,记录{t1,t2,t4},向左出发
 * 到达悬崖,不记录,回到父节点
 * 第二次到达t4,不记录,向右出发
 * 第一次到达t7,记录{t1,t2,t4,t7},向左出发
 * 到达悬崖,不记录,回到父节点
 * 第二次到达t7,不记录,向右出发
 * 到达悬崖,不记录,回到父节点
 * 第三次到达t7,不记录,回到父节点
 * 第三次到达t4,不记录,回到父节点
 * 第二次到达t2,不记录,向右出发
 * 第一次到达t5,记录{t1,t2,t4,t7,t5},向左出发
 * 到达悬崖,不记录,回到父节点
 * 第二次到达t5,不记录,向右出发
 * 到达悬崖,不记录,回到父节点
 * 第三次到达t5,不记录,回到父节点
 * 第三次到达t2,不记录,回到父节点
 * 第二次到达t1,向右出发
 * 第一次到达t3,记录{t1,t2,t4,t7,t5,t3},向左出发
 * 第一次到达t6,记录{t1,t2,t4,t7,t5,t3,t6},向左出发
 * 到达悬崖,不记录,回到父节点
 * 第二次到达t6,不记录,向右出发
 * 到达悬崖,不记录,回到父节点
 * 第三次到达t6,不记录,向右出发
 * 第二次到达t3,不记录,向右出发
 * 到达悬崖,不记录,回到父节点
 * 第三次到达t3,不记录,回到父节点
 * 第三次到达t1,不记录,回到父节点,没有父节点结束了
 *
 *

 *  栈的处理方式
 * 1. 第一次到达一个节点,记录这个节点的名称,压栈,然后向左出发
 * 2. 当走到悬崖(null)时,不记录,出栈
 * 3. 第二次到达一个节点,不记录,(看一下节点) 并向右出发
 * 4. 第三次到达一个节点,不记录,出栈
 *
 */
