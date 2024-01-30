public class LL {
    Node head = null;
    private int size;

    LL() {
        size = 0;
    }

    void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void insertMiddle(int data, int loc) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < loc - 1; i++) {
            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        if (head.next == null) {
            head.next = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }
        head = head.next;
    }

    void deleteMiddle(int loc) {
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < loc - 2; i++) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currentNode = head;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }

    void printList() {
        if (head == null) {
            System.out.println("The list is empty!");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    void printSize() {
        System.out.println(size);
    }

    void reverseList(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        while(currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    Node reverseListRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseListRecursive(head.next);
        head.next.next = head.next;
        head.next = null;
        return newHead;
    }
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
}
