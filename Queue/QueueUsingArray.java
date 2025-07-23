package Queue;

public class QueueUsingArray {
    private int[] arr;
    private int front;
    private int size;

    public QueueUsingArray(){
        arr = new int[5];
        front = 0;
        size = 0;
    }
    public QueueUsingArray(int n){
        arr = new int[n];
        front = 0;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == arr.length;
    }
    public void enqueue(int val) throws Exception{
        if(isFull()) throw new Exception("queue is full");
        arr[(size + front) % arr.length] = val;
        size++;
    }
    public int dequeue() throws Exception{
        if(isEmpty()) throw new Exception("queue is empty");
        int t = arr[front];
        front++;
        return t;
    }
}
