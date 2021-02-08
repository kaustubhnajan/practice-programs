public class FindLoop {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(3);
        node1.next.next.next = new Node(4);
        node1.next.next.next.next = new Node(5);
        node1.next.next.next.next.next = node1.next;


        Node slowPointer = node1;
        Node fastPointer = node1;

        boolean hasLoop = false;
        while (fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (fastPointer.equals(slowPointer)) {
                hasLoop = true;
                break;
            }
        }

        if (hasLoop) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
