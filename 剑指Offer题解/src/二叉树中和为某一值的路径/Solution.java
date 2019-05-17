package 二叉树中和为某一值的路径;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {

    static ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
    static ArrayList<Integer> path = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root == null) return paths;
        path.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null) {
            paths.add(new ArrayList<>(path));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        path.remove(path.size() - 1);

        return paths;
    }

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}