class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Demo {
    // Function to reverse LinkedList
    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;     // save next
            current.next = prev;     // reverse link
            prev = current;          // move prev forward
            current = next;          // move current forward
        }

        return prev;  // prev is new head
    }

    public static void main(String[] args) {
        // Create LinkedList manually
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);

        // Reverse it
        head = reverse(head);

        // Print reversed list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
