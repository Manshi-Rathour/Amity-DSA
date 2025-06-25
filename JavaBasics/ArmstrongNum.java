package JavaBasics;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        int arms = 0;

        // Count
        int n1 = n;
        while(n1 != 0){
            n1 = n1/10;
            count++;
        }
        System.out.println("No. of digits: " + count);

        // Calculating Armstrong
        n1 = n;
        while(n1 != 0){
            int r = n1%10;
            int rr = (int) Math.pow(r, count);
            arms = arms + rr;
            n1 = n1/10;
        }

        // Checking Armstrong or not
        if(arms == n){
            System.out.println("It is armstrong");
            System.out.println("Armstrong: " + arms);
        }
        else{
            System.out.println("It is not armstrong");
        }
    }
}
