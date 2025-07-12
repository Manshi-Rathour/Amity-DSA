package Recursion;

public class Fibbonacci {
    public static int fibb(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        return fibb(n-1) + fibb(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibb(5));
    }
}
