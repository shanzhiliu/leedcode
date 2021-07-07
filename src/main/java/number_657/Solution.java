package number_657;

import org.omg.CORBA.WrongTransactionHolder;
import sun.security.provider.Sun;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if (root == null)  return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
 

        while (queue.size() != 0) {
            
            Integer cuCount =  queue.size();

            double sum = 0;
            for (int i = 0; i < cuCount; i++) {
                //弹出
                TreeNode cuNode = queue.poll();
                sum += cuNode.val;
                //加入弹出节点的下一层
                if(cuNode.left != null) queue.add(cuNode.left);
                if(cuNode.right != null) queue.add(cuNode.right);
            }

            list.add((sum / cuCount ));
            
        }

        return list;
    }
}