public class MainClass {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Preorder Traversal");
        TraversalUtils.preorderTraversal(root);
        System.out.println("\nInorder Traversal");
        TraversalUtils.inorderTraversal(root);
        System.out.println("\nPostorder Traversal");
        TraversalUtils.postorderTraversal(root);

        System.out.println("\n\nHeight: " + CoreUtils.calculateHeight(root));

        System.out.println("\nNumber of nodes: " + CoreUtils.countNumberOfNodesIterative(root));
        System.out.println("Number of nodes: " + CoreUtils.countNumberOfNodesRecursive(root));

        System.out.println("Number of Leaf nodes: " + CoreUtils.calculateLeafNodesCountIterative(root));
        System.out.println("Number of Leaf nodes: " + CoreUtils.caulculateLeafNodesCountRecursive(root));
    }
}
