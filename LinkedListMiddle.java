public class LinkedListMiddle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // insert nodes
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // print linked list
    public void printList() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void findMiddle() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int midIndex = length / 2;
        temp = head;
        for (int i = 0; i < midIndex; i++) {
            temp = temp.next;
        }

        System.out.println("Middle node is: " + temp.data);
    }

    public static void main(String[] args) {
        LinkedListMiddle list = new LinkedListMiddle();

        // insert 9 nodes (odd case)
        for (int i = 1; i <= 9; i++) {
            list.insert(i);
        }

        list.printList();
        list.findMiddle();

        System.out.println();

        // insert 8 nodes (even case)
        LinkedListMiddle listEven = new LinkedListMiddle();
        for (int i = 1; i <= 8; i++) {
            listEven.insert(i);
        }

        listEven.printList();
        listEven.findMiddle();
    }
}
