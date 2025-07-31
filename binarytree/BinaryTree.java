package binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        BinaryTree b1 = new BinaryTree();
        b1.createBinaryTree();

        // System.out.println(b1.maxValue(b1.root));
        // b1.levelOrderTraversal(b1.root);
        // b1.postOrderIterative(b1.root);
        // System.out.println();
        // b1.postOrderRecursive(b1.root);
        // b1.inOrderIterative(b1.root);
        // System.out.println();
        // b1.inOrderRecursive(b1.root);
        // b1.preOrderIterative(b1.root);
        b1.preOrderRecursive(b1.root);
    }



    public int maxValue(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int result = root.val;
        ;
        int left = maxValue(root.left);
        int right = maxValue(root.right);
        if (left > result) {
            result = left;
        }
        if (right > result) {
            result = right;
        }
        return result;
    }

    public void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.val + "  ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    public void postOrderIterative(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.val + "  ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.val + "  ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }

    public void postOrderRecursive(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.val + "  ");
    }

    public void inOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.val + "  ");
                temp = temp.right;
            }

        }

    }

    public void inOrderRecursive(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderRecursive(root.left);
        System.out.print(root.val + "  ");
        inOrderRecursive(root.right);
    }

    public void preOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.val + "  ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }

    }

    public void preOrderRecursive(TreeNode root) { // recursive pre order binary tree traversal
        if (root == null) {
            return;
        }
        System.out.print(root.val + "  ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public void createBinaryTree() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        root = t1;
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

    }
}
