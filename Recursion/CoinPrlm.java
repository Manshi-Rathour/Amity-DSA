package Recursion;

public class CoinPrlm {
    public static void coin(int i, String ans){
        if(i==0){
            System.out.println(ans);
            return;
        }

        coin(i-1, ans+"H");
        coin(i-1, ans+"T");
    }
    public static void main(String[] args) {
        coin(3, "");
    }
}
