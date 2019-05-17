package 二叉搜索树与双向链表;


import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        // 保存中序遍历的节点
        ArrayList<TreeNode> list = new ArrayList<>();
        TreeNode tem = pRootOfTree;
        // 中序遍历
        while(tem != null || !stack.empty()) {
            while(tem != null) {
                stack.push(tem);
                tem = tem.left;
            }
            if(!stack.empty()) {
                tem = stack.pop();
                list.add(tem);
                tem = tem.right;
            }
        }
        // 构建双向链表
        TreeNode temp, head = list.get(0);
        temp = head;
        for(int i = 1; i < list.size(); i++) {
            temp.right = list.get(i);
            temp = list.get(i);
            temp.left = list.get(i - 1);
        }
        return head;
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