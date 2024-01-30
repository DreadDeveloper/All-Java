public class Main {
    public static void main(String[] args) {
        LL ll = new LL();
        ll.printList();
        ll.insertFirst(98);
        ll.insertFirst(1);
        ll.insertLast(100);
        ll.insertLast(200);
        ll.printList();
        ll.reverseList();
        ll.printList();
        ll.deleteFirst();
        ll.deleteLast();
        ll.insertMiddle(99, 1);
        ll.printList();
        ll.deleteMiddle(1);
        ll.printList();
        ll.printSize();
    }
}