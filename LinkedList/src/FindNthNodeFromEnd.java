public class FindNthNodeFromEnd {

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

        while (pointer1 != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        System.out.println(pointer2.value);
    }
}
