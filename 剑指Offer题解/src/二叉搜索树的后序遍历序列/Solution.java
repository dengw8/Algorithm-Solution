package 二叉搜索树的后序遍历序列;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = initTree();

        ArrayList<Integer> list = inOrder2(root);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
    }

    private static TreeNode initTree() {
        TreeNode root = new TreeNode(6);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);

        root.left = node4;
        root.right = node8;
        node4.left = node2;
        node4.right = node5;
        node2.left = node1;
        node2.right = node3;
        node8.left = node7;
        node8.right = node9;

        return root;
    }


    // 前序遍历的第一种非递归实现方法
    public static ArrayList<Integer> preOrder1(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode tem = root;
        while(tem != null || !stack.empty()) {
            //一直遍历左边的节点直到叶节点
            while(tem != null) {
                res.add(tem.val);
                stack.push(tem);
                tem = tem.left;
            }
            // 到达叶子节点开始遍历右边的节点
            if(!stack.empty()) {
                tem = stack.pop();
                tem = tem.right;
            }
        }
        return res;
    }

    // 前序遍历的非递归实现方法2
    public static ArrayList<Integer> preOrder2(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode tem;
        while(!stack.empty()) {    // 进入循环的条件是栈不为空
            tem = stack.pop();     // 获取并弹出栈顶元素
            res.add(tem.val);
            /*
             * 注意因为使用的是栈结构，先入后出,
             * 所以先把右边的节点入栈
             */
            if (tem.right != null) {
                stack.push(tem.right);
            }
            if (tem.left != null) {
                stack.push(tem.left);
            }
        }
        return res;
    }

    // 前序遍历的递归实现
    public static ArrayList<Integer> preOrder_recursion(TreeNode root)  {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;

        // 开始递归调用
        preOrder_recursion_body(root, res);
        return res;
    }

    private static void preOrder_recursion_body(TreeNode root, ArrayList<Integer> res) {
        if(root != null) {
            res.add(root.val);
            preOrder_recursion_body(root.left, res);
            preOrder_recursion_body(root.right, res);
        }
    }

    // 中序遍历的非递归实现方法1
    public static ArrayList<Integer> inOrder1(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode tem = root;
        while(tem != null || !stack.empty()) {
            while(tem != null) {
                stack.push(tem);
                tem = tem.left;
            }

            if(!stack.empty()) {
                tem = stack.pop();
                res.add(tem.val);
                tem = tem.right;
            }
        }
        return res;
    }

    // 中序遍历的非递归实现
    public static ArrayList<Integer> inOrder2(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode temp;
        while (!stack.empty())
        {
            temp = stack.peek();
            if (temp.left != null) {    //一直遍历左节点
                stack.push(temp.left);
                temp.left = null;
            } else {
                TreeNode p = stack.pop();
                res.add(p.val);
                if (p.right != null) {
                    stack.push(p.right);
                }
            }
        }
        return res;
    }

    // 中序遍历的递归实现
    public static ArrayList<Integer> inOrder_recursion(TreeNode root)  {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;

        inOrder_recursion_body(root, res);
        return res;
    }

    private static void inOrder_recursion_body(TreeNode root, ArrayList<Integer> res) {
        if(root != null) {
            inOrder_recursion_body(root.left, res);
            res.add(root.val);
            inOrder_recursion_body(root.right, res);
        }
    }

    // 后序遍历的非递归实现
    public static ArrayList<Integer> postOrder(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode temp;
        while (!stack.isEmpty())
        {
            temp = stack.peek();
            if (temp.left == null && temp.right == null)
            {
                TreeNode pop = stack.pop();
                res.add(pop.val);
            } else {
                if (temp.right != null) {
                    stack.push(temp.right);
                    temp.right = null;
                }
                if (temp.left != null) {
                    stack.push(temp.left);
                    temp.left = null;
                }
            }
        }
        return res;
    }


    // 后序遍历的递归实现
    public static ArrayList<Integer> postOrder_recursion(TreeNode root)  {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;

        postOrder_recursion_body(root, res);
        return res;
    }

    public static void postOrder_recursion_body(TreeNode root, ArrayList<Integer> res) {
        if(root != null) {
            postOrder_recursion_body(root.left, res);
            postOrder_recursion_body(root.right, res);
            res.add(root.val);
        }
    }

    static class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}