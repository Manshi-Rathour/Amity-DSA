package GreedyAlgorithm;

import java.util.ArrayList;

public class IndianCoins {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        int count = 0;
        int amt = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = coins.length - 1; i>=0; i--){
            if(coins[i] <= amt){
                while(coins[i] <= amt){
                    count++;
                    ans.add(coins[i]);
                    amt -= coins[i];
                }
            }
        }

        if(amt == 0){;
            System.out.println(count);
            System.out.println(ans);
        }
        else{
            System.out.println(-1);
        }
    }
}
