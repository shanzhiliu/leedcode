package number_257;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        genetatePath(root,"",list);
        return list;
    }

    private void genetatePath(TreeNode node, String s, List<String> list) {
        if(node == null) return;

        s = s + node.val;
        if(node.left == null && node.right == null) {
            list.add(s);
        }
        else {
            s = s + "->";
        }

        genetatePath(node.left,s,list);
        genetatePath(node.right,s,list);

    }


}