package number_559;

import java.util.List;

class Solution {
    public int maxDepth(Node root) {
       return maxDeep(root);
    }

    private int maxDeep(Node node) {
        if(node == null) return 0;

         int maxLevel = 0;

        List<Node> childrenList = node.children;
        for (Node itemNode : childrenList) {
            int level = maxDeep(itemNode);
            if(level > maxLevel) {
                maxLevel = level;
            }
        }
        return maxLevel + 1;
    }
}