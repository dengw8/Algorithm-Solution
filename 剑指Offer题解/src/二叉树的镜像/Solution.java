package 二叉树的镜像;


public class Solution {
    public void Mirror(TreeNode root) {
        if(root != null) {
            TreeNode tem = root.left;
            root.left = root.right;
            root.right = tem;
            Mirror(root.left);
            Mirror(root.right);
        }
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