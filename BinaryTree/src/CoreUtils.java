import java.util.LinkedList;
import java.util.Queue;

public class CoreUtils {

    public static int calculateHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftNodeHeight = calculateHeight(root.left);
        int rightNodeHeight = calculateHeight(root.right);
        int height = Math.max(leftNodeHeight, rightNodeHeight) + 1;
        return height;
    }

    public static int countNumberOfNodesIterative(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 0;
        while (queue.size() > 0) {
            TreeNode node = queue.remove();
            count++;

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return count;
    }

    public static int countNumberOfNodesRecursive(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int countL = countNumberOfNodesRecursive(root.left);
        int countR = countNumberOfNodesRecursive(root.right);
        return countL + countR + 1;
    }

    public static int calculateLeafNodesCountIterative(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 0;
        while (queue.size() > 0) {
            TreeNode node = queue.remove();

            if (node.left == null && node.right == null) {
                count++;
            }

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return count;
    }

    public static int caulculateLeafNodesCountRecursive(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        return caulculateLeafNodesCountRecursive(root.left) + caulculateLeafNodesCountRecursive(root.right);
    }
}
