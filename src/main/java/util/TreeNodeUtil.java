package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNodeUtil {

    public  static  TreeNode getRootNode(Integer[] array){
        if(array == null || array.length == 0) return null;


        //得到层级数
        int level = getLevel(array.length);

        //满二叉树的节点数
        int all = (int)Math.pow(2, level) - 1;
        List<TreeNode> treeNodeList = new ArrayList<>();

        //建立满二叉树,没有左右子树关系
        for (int i = 0; i < all; i++) {
            Integer cuValue = null;
            if(i < array.length) {
                cuValue = array[i];
            }
            TreeNode node = null;
            if(cuValue != null) {
                node = new TreeNode(cuValue,null,null);
            }
            treeNodeList.add(node);
        }

        //n-1层的节点数
        int index = (int)Math.pow(2, level - 1) - 1;
        //建立左右子树关系,只需建立n-1层的关系就行了
        for (int i = 0; i < index; i++) {
            TreeNode cuNode = treeNodeList.get(i);
            TreeNode leftNode = treeNodeList.get(i * 2 + 1);
            TreeNode rightNode = treeNodeList.get(i * 2 + 2);
            cuNode.left = leftNode;
            cuNode.right = rightNode;
        }

        return treeNodeList.get(0);
    }

    public static int getLevel(int count) {
        int level = (int) log2(count);
        return level + 1;

    }

    public static double log2(double N) {
        return Math.log(N)/Math.log(2);//Math.log的底为e
    }

    public static void main(String[] args) {
        TreeNode rootNode = getRootNode(new Integer[]{3, 5, 1, 6, 2, 9, 8, null, null, 7, 4});
        System.out.println(rootNode);

    }

}
