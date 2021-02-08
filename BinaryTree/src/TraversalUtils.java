public class TraversalUtils {

    public static void preorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + ", ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        inorderTraversal(node.left);
        System.out.print(node.data + ", ");
        inorderTraversal(node.right);
    }

    public static void postorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }

        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data + ", ");
    }
}
