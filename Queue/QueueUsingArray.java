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
        int idx = (size + front) % arr.length;
        arr[idx] = val;
        size++;
    }
    public int dequeue() throws Exception{
        if(isEmpty()) throw new Exception("queue is empty");
        int t = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return t;
    }
    public int size(){
        return size;
    }
    public void display(){
        for(int i=0; i<size; i++){
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }
    public int peek() throws Exception{
        if(isEmpty()) throw new Exception("queue is empty");

        return arr[front];
    }
}