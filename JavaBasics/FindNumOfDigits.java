package JavaBasics;

import java.util.Scanner;

public class FindNumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find its no. of digits: ");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;

        while(n != 0){
            int r = n%10;
            n = n/10;
            count++;
            sum = sum + r;
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("No. of digits: " + count);

    }
}
