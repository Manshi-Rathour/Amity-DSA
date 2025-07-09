package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string to check palindrome: ");
        String s = sc.next();

        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            sb.append(ch);
        }

        if(s.contains(sb)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
