package Stack;

public class StackUsingArray {
    private int[] arr;
    private int top;

    public StackUsingArray(){
        arr = new int[5];
        top = 0;
    }
    public StackUsingArray(int n){
        arr = new int[n];
        top = 0;
    }
    public boolean isEmpty(){
        return top == 0;
    }
    public boolean isFull(){
        return top == arr.length;
    }
    public void push(int val) throws Exception{
        if(isFull()) throw new Exception("stack is full");

        arr[top] = val;
        top++;
    }
    public int pop() throws Exception{
        if(isEmpty()) throw new Exception("stack is empty");

        int t = arr[top-1];
        top--;
        return t;
    }
    public int peek() throws Exception{
        if(isEmpty()) throw new Exception("stack is empty");

        int t = arr[top-1];
        return t;
    }
    public void display(){
        for(int i=0; i < top; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int size(){
        return top;
    }
}
