package Backtracking;

import java.util.ArrayList;

public class SumTheCoinsToAchieveTarget {
//    public static void sumCoins(int[] coins, int i, String ans, int t){
//        if(t==0){
//            System.out.println(ans);
//            return;
//        }
//
//        for(i=i; i<coins.length; i++){
//            if(t >= coins[i]){
//                sumCoins(coins, i, ans+coins[i], t-coins[i]);
//            }
//        }
//    }

    public static void sumCoins(int[] coins, int i, ArrayList<Integer> ans, int target){
        if(target==0){
            System.out.println(ans);
            return;
        }

        while(i<coins.length){
            if(target >= coins[i]){
                ans.add(coins[i]);
                sumCoins(coins, i, ans, target-coins[i]);
                ans.remove(ans.size()-1);  // Backtracking
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] coins = {2, 3, 5};
        ArrayList<Integer> ans = new ArrayList<>();
        sumCoins(coins, 0, ans, 8);
    }
}