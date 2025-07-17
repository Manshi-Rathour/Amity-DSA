package Backtracking;

import java.util.*;

public class Permutations {
    public static void permutations(int[] nums, boolean[] used, int idx, List<Integer> ans, List<List<Integer>> result) {

        if(idx == nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(!used[i]){
                ans.add(nums[i]);
                used[i] = true;
                permutations(nums, used, idx+1, ans, result);

                // Backtrack
                used[i] = false;
                ans.remove(ans.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        permutations(nums, used, 0, ans, result);
        System.out.println(result);
    }
}
