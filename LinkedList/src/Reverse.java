public class Reverse {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(4);
        node1.next.next.next.next = new Node(5);

        Node next = null;
        Node prev = null;
        Node current = node1;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        while (prev != null) {
            System.out.print(prev.value);
            if (prev.next != null) {
                System.out.print("->");
            }
            prev = prev.next;
        }
    }
}
