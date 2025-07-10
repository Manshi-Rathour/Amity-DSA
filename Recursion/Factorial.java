package Recursion;

public class Factorial {
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        int smaller = fact(n-1);
        return n * smaller;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
