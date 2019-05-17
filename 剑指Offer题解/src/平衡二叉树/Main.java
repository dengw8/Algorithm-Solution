package 平衡二叉树;

public class Main {
    public static void main(String[] args) {

    }
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null) return true;
        int l = getmMaxHeight(root.left);
        int r = getmMaxHeight(root.right);
        if(l > r + 1 || r > l + 1) return false;

        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    private int getmMaxHeight(TreeNode root) {
        if(root == null) return 0;
        int l = 1 + getmMaxHeight(root.left);
        int r = 1 + getmMaxHeight(root.right);
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
