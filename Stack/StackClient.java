package Stack;

public class StackClient {
    public static void main(String[] args) throws Exception{
        StackUsingArray s = new StackUsingArray(5);

//        System.out.println(s.isEmpty());

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.size());

        s.display();

    }
}
