package Queue;

public class QueueClient {
    public static void main(String[] args) throws Exception{
        QueueUsingArray q = new QueueUsingArray(1);

        q.enqueue(1);
        q.enqueue(2);

        System.out.println(q.isEmpty());
    }
}
