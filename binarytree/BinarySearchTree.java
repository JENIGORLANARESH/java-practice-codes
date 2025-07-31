package binarytree;

public class BinarySearchTree {
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
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(20);
        bst.insert(5);

        
        // System.out.println(bst.isValid(bst.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
        // if (null == bst.search(10)) {
        // System.out.println("key not found..");
        // } else {
        // System.out.println("key found..");
        // }
        // bst.inOrder(bst.root);
    }

    public boolean isValid(TreeNode root, long min, long max) {
        if (root == null) { // base case
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        boolean left = isValid(root.left, min, max);
        if (left) {
            boolean right = isValid(root.right, min, max);
            return right;
        }
        return false;
    }

    public TreeNode search(int val) {
        return search(root, val);
    }

    public TreeNode search(TreeNode root, int val) {
        if (root == null || val == root.val) {
            return root;
        }
        if (val < root.val) {
            return search(root.left, val);
        } else {
            return search(root.right, val);
        }
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + "  ");
        inOrder(root.right);
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
}
