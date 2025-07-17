package Backtracking;

import java.util.*;

public class PalindromePartitioning {
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void partition(String s, ArrayList<String> list){

        if(s.length() == 0){
            System.out.println(list);
            return;
        }

        for(int i=1; i<=s.length(); i++){
            String str = s.substring(0, i);
            if(isPalindrome(str)){
                list.add(str);
                partition(s.substring(i), list);
                list.remove(list.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        String s = "abab";
        partition(s, new ArrayList<>());
    }
}
