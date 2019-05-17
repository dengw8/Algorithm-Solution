package 重建二叉树;

public class Solution {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = run(pre, 0, pre.length - 1, in, 0, pre.length - 1);
        return root;
    }

    public static TreeNode run(int [] pre, int pl, int pr, int [] in, int il, int ir) {
        if(pl > pr || il > ir) return null;
        TreeNode node = new TreeNode(pre[pl]);
        int i;
        for(i = il; i<= ir; i++) {
            if(pre[pl] == in[i]) {
                break;
            }
        }
        int len = i - il;
        node.left = run(pre, pl + 1, pl + len, in, il, i - 1);
        node.right = run(pre, pl + len + 1, pr, in, i + 1, ir);
        return node;
    }

     public static  class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }
}