public class LinkedListFlattening {

    public static void main(String[] args) {

        Node root = pushNode(null, 30);
        root = pushNode(root, 8);
        root = pushNode(root, 7);
        root = pushNode(root, 5);

        root.right = pushNode(root.right, 20);
        root.right = pushNode(root.right, 10);

        root.right.right = pushNode(root.right.right, 50);
        root.right.right = pushNode(root.right.right, 22);
        root.right.right = pushNode(root.right.right, 19);

        root.right.right.right = pushNode(root.right.right.right, 45);
        root.right.right.right = pushNode(root.right.right.right, 40);
        root.right.right.right = pushNode(root.right.right.right, 35);
        root.right.right.right = pushNode(root.right.right.right, 20);

        root = flatten(root);
        print(root);
    }

    private static Node flatten(Node root) {
        if (root == null || root.right == null) {
            return root;
        }

        root.right = flatten(root.right);

        root = merge(root, root.right);

        return root;
    }

    private static Node merge(Node a, Node b) {
        if (a == null) {
            return b;
        }

        if (b == null) {
            return a;
        }

        Node result = null;
        if (a.data < b.data) {
            result = a;
            result.down = merge(a.down, b);
        } else {
            result = b;
            result.down = merge(a, b.down);
        }
        result.right = null;
        return result;
    }

    private static Node pushNode(Node headRef, int data) {
        Node newNode = new Node(data);

        newNode.down = headRef;
        headRef = newNode;

        return headRef;
    }

    private static void print(Node root) {
        while (root != null) {
            System.out.print(root.data + " ");
            root = root.down;
        }
    }

    private static class Node {
        int data;
        Node right;
        Node down;

        public Node(int data) {
            this.data = data;
            this.right = null;
            this.down = null;
        }
    }
}
