public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(4);
        node1.next.next.next.next = new Node(5);

        int nodeNum = 3;

        Node pointer1 = node1;
        Node pointer2 = node1;

        for (int i = 0; i < nodeNum; i++) {
            pointer1 = pointer1.next;
        }

        while (pointer1.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

//        Node deletedNode = pointer2.next;
        pointer2.next = pointer2.next.next;
//        deletedNode.next = null;
//        deletedNode = null;

        while (node1 != null) {
            System.out.print(node1.value);
            if (node1.next != null) {
                System.out.print("->");
            }
            node1 = node1.next;
        }
    }
}
