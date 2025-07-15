package Recursion;

public class LetterCombinationsOfPhoneNumber {
    static String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs",  "tuv", "wxyz"};
    public static void combinations(String str, String ans, int idx){
        if(idx == str.length()){
            System.out.println(ans);
            return;
        }

        int d = str.charAt(idx) - '0';
        String s = keys[d];

        for(int i=0; i<s.length(); i++){
            combinations(str, ans+s.charAt(i), idx+1);
        }
    }
    public static void main(String[] args) {
        String str = "23";

        combinations(str, "", 0);
    }
}
