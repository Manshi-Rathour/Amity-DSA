package Oops;

public class ExceptionThrow {
    public static void main(String[] args) throws Exception{
        int age = 15;
        if(age < 18) throw new Exception("you can't drive");
        else System.out.println("you can drive");
    }
}
