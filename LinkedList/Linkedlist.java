package LinkedList;

import java.lang.invoke.WrongMethodTypeException;

public class Linkedlist {
    public class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size = 0;

    public void addFront(int val){
        Node n = new Node();
        n.data = val;
        n.next = head;
        head = n;
        if(size == 0){
            tail = n;
        }
        size++;
    }

    public void addLast(int val){
        if(size == 0){
            addFront(val);
        }
        Node n = new Node();
        n.data = val;
        tail.next = n;
        tail = n;
        size++;
    }

    public void addAtIxd(int idx, int val) throws Exception{
        if(idx == 0){
            addFront(val);
        }
        else if(idx == size){
            addLast(val);
        }
        else{
            Node prev = getNode(idx-1);
            Node n = new Node();
            n.data = val;
            n.next = prev.next;
            prev.next = n;
            size++;
        }
    }

    public int removeFirst() throws Exception{
        if(size == 0) throw new Exception("LinkedList is empty");
        Node temp = head;
        head = head.next;
        temp.next = null;
        if(size == 1){
            tail = null;
        }
        size--;
        return temp.data;
    }

    public int removeLast() throws Exception{
        if(size == 0) throw new Exception("LinkedList is empty");
        else if (size == 1) {
            int data = head.data;
            head = tail = null;
            size--;
            return data;
        }
        Node prev = getNode(size - 2);
        int data = tail.data;
        tail = prev;
        prev.next = null;
        size--;
        return data;
    }

    public int removeAtIdx(int idx) throws Exception {
        if (idx == 0) {
            return removeFirst();
        }
        else if (idx == size - 1) {
            return removeLast();
        }
        else {
            Node prev = getNode(idx - 1);
            Node remove = prev.next;
            prev.next = remove.next;
            remove.next = null;
            size--;
            return remove.data;
        }
    }

    public int size(){
        return size;
    }

    public void display(){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public Node getNode(int idx) throws Exception {
        if (idx < 0 || idx >= size) {
            throw new Exception("Node doesn't exist");
        }

        Node curr = head;
        for (int i = 0; i < idx; i++) {
            curr = curr.next;
        }
        return curr;
    }

}
