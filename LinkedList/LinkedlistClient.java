package LinkedList;

public class LinkedlistClient {
    public static void main(String[] args) throws Exception{
        Linkedlist ll = new Linkedlist();

        ll.addFront(2);
        ll.addFront(5);
        ll.addLast(4);
        ll.addAtIxd(2, 7);
        ll.display();
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        ll.display();
        System.out.println(ll.removeAtIdx(0));
        ll.display();
        ll.addFront(3);
        ll.addFront(9);
        ll.display();

    }
}
