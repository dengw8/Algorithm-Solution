package 对称的二叉树;

public class Main {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        return help(pRoot.left,pRoot.right);
    }

    boolean help(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;
        if (t1 != null && t2 != null)
            return t1.val == t2.val && help(t1.left, t2.right) && help(t1.right, t2.left);
        return false;
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
