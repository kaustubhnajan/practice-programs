public class Merge2Sorted {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        node1.next = new Node(4);
        node1.next.next = new Node(5);
        node1.next.next.next = new Node(7);
        node1.next.next.next.next = new Node(9);

        Node node2 = new Node(2);
        node2.next = new Node(3);
        node2.next.next = new Node(6);
        node2.next.next.next = new Node(8);
        node2.next.next.next.next = new Node(10);

        Node node3 = null;
        if (node1.value < node2.value) {
            node3 = node1;
            node1 = node1.next;
        } else {
            node3 = node2;
            node2 = node2.next;
        }
        Node head = node3;

        while (node1 != null && node2 != null) {
            if (node1.value < node2.value) {
                node3.next = node1;
                node1 = node1.next;
            } else {
                node3.next = node2;
                node2 = node2.next;
            }
            node3 = node3.next;
        }

        while (node1 != null) {
            node3.next = node1;
            node1 = node1.next;
        }

        while (node2 != null) {
            node3.next = node2;
            node2 = node2.next;
        }

        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
