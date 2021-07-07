package number_100;

class Solution1 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return compareTree(p,q);
    }

    private boolean compareTree(TreeNode p, TreeNode q) {
        //break
        if(p == null && q == null) return true;

        else if (p == null || q == null){
            return false;
        }

        boolean current = p.val == q.val;
        boolean left = compareTree(p.left, q.left);
        boolean right = compareTree(p.right, q.right);

        return  current && left && right;

    }
}

/*

break (不一样 就停止) ((一个为空,一个不为空-false),(两个都是空-true),(两个都不是空,值不同-false))

比较左边是否一样.比较右边是否一样 (如果都一样,true,不一样 false)




 */

/*
 f(5) = f(4) + f(3)

 f(4) = f(3) + f(2)
 f(3) = f(2) + f(1)
 f(3) = f(2) + f(1)
 */