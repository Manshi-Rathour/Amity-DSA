package Recursion;

public class SubsequenceOfString {
    public static void subSeq(String s, int i, String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }

        // include
        subSeq(s, i+1, ans+s.charAt(i));
        // exclude
        subSeq(s, i+1, ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        subSeq(s, 0, "");
    }
}
