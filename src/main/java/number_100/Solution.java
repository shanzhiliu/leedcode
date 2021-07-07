package number_100;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public boolean isSame = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        compareLeftTree(p,q);
        compareLeftTree(q,p);
        return isSame;
    }

    private void compareLeftTree(TreeNode p, TreeNode q) {
        if(p == null) return;


        if(q == null) {
            isSame = false;
            return;
        }

        else {

            if(p.val == q.val) {
                compareLeftTree(p.left,q.left);
                compareLeftTree(p.right,q.right);
            }
            else {
                isSame = false;
                return;
            }

        }
    }
}