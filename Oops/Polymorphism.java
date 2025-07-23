package Oops;

public class Polymorphism {
    // method overloading
    public static int sum(int a, int b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        int sum = sum(2, 3);
        System.out.println(sum);

        double sum1 = sum(2.5, 4.5);
        System.out.println(sum1);

        int sum2 = sum(2, 3, 4);
        System.out.println(sum2);
    }
}
