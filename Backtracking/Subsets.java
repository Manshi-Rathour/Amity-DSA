package Backtracking;

import java.util.*;

public class Subsets {
    public static void subsets(int[] nums, int idx, List<Integer> ans, List<List<Integer>> result){
        result.add(new ArrayList<>(ans));

        if (idx == nums.length) {
            return;
        }

        for(int i=idx; i<nums.length; i++){
            ans.add(nums[i]);

            subsets(nums, i+1, ans, result);

            ans.remove(ans.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        subsets(nums, 0, ans, result);

        System.out.println(result);
    }
}
