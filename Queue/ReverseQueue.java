package Queue;

public class ReverseQueue {
    public static void main(String[] args) throws Exception{
        QueueUsingArray q = new QueueUsingArray();

        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(8);

        q.display();

        reverse(q);

        q.display();
    }

    public static void reverse(QueueUsingArray q) throws Exception{
        if(q.isEmpty()){
            return;
        }
        int x = q.dequeue();
        reverse(q);
        q.enqueue(x);
    }
}
