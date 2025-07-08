package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string to check palindrome: ");
        String s = sc.next();

        int n = s.length();

        char[] ans = new char[s.length()];

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            ans[n-1-i] = ch;
        }

        String reversed = new String(ans);

        if(s.contains(reversed)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
