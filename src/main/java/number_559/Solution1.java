package number_559;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution1 {
    public int maxDepth(Node root) {
       return maxDeep(root);
    }

    private int maxDeep(Node node) {
        if(node == null) return 0;

        int maxLevel = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (queue.size() != 0) {
            maxLevel ++;

            int childCount =  queue.size();
            for (int i = 0; i < childCount; i++) {
                Node cuNode = queue.poll();
                List<Node> childrenList = cuNode.children;
                for (Node itemNode : childrenList) {
                    queue.add(itemNode);
                }
            }


        }
        return  maxLevel;
    }
}