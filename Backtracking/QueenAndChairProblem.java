package Backtracking;

public class QueenAndChairProblem {
    public static void seat(String ans, int n, boolean[] chair){
        if(n==0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<chair.length; i++){
            if(chair[i] == false){
                chair[i] = true;
                seat(ans+"C"+i+"Q"+n+" ", n-1, chair);
                chair[i] = false; // backtracking
            }
        }
    }
    public static void main(String[] args) {
        boolean[] chair = new boolean[3];
        seat("",2, chair);
    }
}
