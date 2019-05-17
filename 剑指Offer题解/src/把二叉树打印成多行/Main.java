package 把二叉树打印成多行;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(pRoot == null) return res;

        Queue<TreeNode> queue = new PriorityQueue<>();
        queue.add(pRoot);

        while(!queue.isEmpty()) {
            int n = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                TreeNode temp = queue.peek();
                list.add(temp.val);
                if(temp.left != null) queue.add(temp.left);
                if(temp.right != null) queue.add(temp.right);
                queue.remove();
            }
            res.add(list);
        }

        return res;
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
