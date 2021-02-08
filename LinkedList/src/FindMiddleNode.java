public class FindMiddleNode {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(4);
        node1.next.next.next.next = new Node(5);

        Node slowPointer = node1;
        Node fastPointer = node1;
        while (fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        System.out.println(slowPointer.value);
    }
}
