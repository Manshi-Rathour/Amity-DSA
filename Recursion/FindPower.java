package Recursion;

public class FindPower {
    public static int pow(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }

//        int p = x * pow(x, n-1);
//        return p;

        int res = pow(x, n/2);
        if(n%2==0){
            return res * res;
        }
        else{
            return res * res * x;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
