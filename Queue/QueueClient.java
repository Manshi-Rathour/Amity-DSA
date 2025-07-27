package Queue;

public class QueueClient {
    public static void main(String[] args) throws Exception{
        QueueUsingArray q = new QueueUsingArray(10);

//        System.out.println(q.isEmpty());

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display();

        System.out.println(q.dequeue());

        q.display();

        q.enqueue(6);

        q.display();

        System.out.println(q.peek());
    }
}
