package Recursion;

public class GenerateParentheses {
    public static void generateParentheses(int open, int close, String ans, int n){
        if(open==n && close==n){
            System.out.println(ans);
            return;
        }

        if(open < n){
            generateParentheses(open+1, close,ans+"(", n);
        }
        if(close < open){
            generateParentheses(open, close+1, ans+")", n);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        generateParentheses(0, 0, "", n);
    }
}
