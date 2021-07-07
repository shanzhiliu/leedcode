package number_590;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        postOrderVisit(root,list);
        return list;
    }

    private void postOrderVisit(Node node, List<Integer> list) {

        if(node == null) return;

        node.children.stream().forEach(n -> {
            postOrderVisit(n,list);
        });

        list.add(node.val);

    }
}