public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    private TreeNode insert(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }
        if (val < node.val) {
            node.left = insert(node.left, val);
        } else if (val > node.val) {
            node.right = insert(node.right, val);
        }
        return node;
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.val + " ");
            inorderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(1);
        tree.insert(9);
        System.out.println("Inorder Traversal: ");
        tree.inorderTraversal();
    }
}