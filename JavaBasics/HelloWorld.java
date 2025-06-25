package JavaBasics;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name: ");
        String name = in.readLine();
        System.out.println("hello " + name);
    }
}
