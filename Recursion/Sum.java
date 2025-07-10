package Recursion;

public class Sum {
    public static int sum(int n){
        if(n==1) return 1;
        int sumNm1 = sum(n-1);
        return n + sumNm1;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
