package LinkedList;

import java.util.*;

public class LLClient {
    static LL head;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL n = new LL(5);
        head = n;

        int i = 1;

        while(i < 5){
            LL nn = new LL();
            nn.val = sc.nextInt();
            n.next = nn;
            n = nn;
            i++;
        }

//        display(head);
//        addLast(8);
//        display(head);
//        addLast(7);
//        addLast(-1);
//        display(head);

        addFirst(0);
        display(head);

        addPos(3, 100);
        display(head);
    }

    public static void display(LL head){
        LL n = head;

        while(n != null){
            System.out.print(n.val + " -> ");
            n = n.next;
        }
        System.out.println();
    }

    public static void addLast(int val){
        if(head == null){
            LL newNode = new LL(val);
            head = newNode;
            return;
        }

        LL prev = null;
        LL curr = head;

        while(curr != null){
            prev = curr;
            curr = curr.next;
        }
        LL newNode = new LL(val);
        prev.next = newNode;
    }
    public static void addFirst(int val){
        LL newNode = new LL(val);
        if(head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void addPos(int idx, int val){
        if(head == null){
            LL newNode = new LL(val);
            head = newNode;
            return;
        }

        LL prev = null;
        LL curr = head;

        while(idx-- > 0){
            prev = curr;
            curr = curr.next;
        }
        LL newNode = new LL(val);
        prev.next = newNode;
        newNode.next = curr;
    }
}
