package 从上往下打印二叉树;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(root);
        TreeNode tem;
        while(!queue.isEmpty()) {
            tem = queue.getFirst();
            list.add(tem.val);
            if(tem.left != null) queue.addLast(tem.left);
            if(tem.right != null) queue.addLast(tem.right);
            queue.removeFirst();
        }
        return list;
    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}