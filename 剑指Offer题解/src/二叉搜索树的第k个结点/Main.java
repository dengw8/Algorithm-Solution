package 二叉搜索树的第k个结点;

public class Main {
    int index = 0;

    TreeNode KthNode(TreeNode root, int k) {
        if(root != null) {
            // 遍历左子树
            TreeNode node = KthNode(root.left, k);
            if(node != null) {
                return node;
            }
            // 判断
            index++;
            if(index == k) return node;

            // 遍历右子树
            node = KthNode(root.right, k);
            if(node != null) {
                return node;
            }

        }

        return null;
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
