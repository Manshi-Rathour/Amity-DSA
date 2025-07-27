package Stack;

public class ReverseStack {
    public static void main(String[] args) throws Exception {
        StackUsingArray s = new StackUsingArray();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        s.display();

        reverse(s);

        s.display();
    }
    public static void reverse(StackUsingArray s) throws Exception{
        if(s.isEmpty()) return;

        int x = s.pop();
        reverse(s);
        insert(s, x);
    }
    public static void insert(StackUsingArray s, int x) throws Exception{
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int top = s.pop();
        insert(s, x);
        s.push(top);
    }
}