package 二叉树的深度;

public class Main {
    public static void main(String[] args) {

    }

    public int TreeDepth(TreeNode root) {
        if(root == null) return 0;
        int l = 1 + TreeDepth(root.left);
        int r = 1 + TreeDepth(root.right);
        if(l > r) return l;
        return r;
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
