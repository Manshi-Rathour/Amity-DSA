package JavaBasics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to check whether it is Palindrome or not: ");
        int num = sc.nextInt();

        int temp = num;
        int reverseNum = 0;
        while(temp != 0){
            int ld = temp % 10;
            reverseNum = reverseNum * 10 + ld;
            temp = temp/10;
        }

        if(num == reverseNum){
            System.out.println("Number is Palindrome");
            System.out.println(reverseNum);
        }
        else{
            System.out.println("Number is not Palindrome");
        }

    }
}
