package String;

public class LongestPalindromicSubstring {
    public static String subStrOdd(String s, int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1, j);
    }

    public static String subStrEven(String s, int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1, j);
    }

    public static String longestPalindrome(String str){
        String ans = "";
        for(int i=0; i<str.length(); i++){
            String odd = subStrOdd(str, i, i);
            String even = subStrEven(str, i, i+1);
            if(odd.length() > ans.length()) ans = odd;
            if(even.length() > ans.length()) ans = even;
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "cdadadaz";
        System.out.println(longestPalindrome(s));

    }
}
