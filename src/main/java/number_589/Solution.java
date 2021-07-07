package number_589;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> preorder(Node root) {

        List<Integer> list = new ArrayList<>();
        preorderVisit(root,list);
        return list;
    }

    private void preorderVisit(Node node, List<Integer> list) {

        if(node == null) return;

        list.add(node.val);

        List<Node> childrenList = node.children;
        for (Node item : childrenList) {
            preorderVisit(item,list);
        }
    }


}