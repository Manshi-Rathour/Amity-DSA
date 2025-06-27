package JavaBasics;

import java.util.Scanner;

// Car is allowed to run Sunday when (sum of even digit is divisible by 4) or (sum of odd digits is divisible by 3)

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int oddSum = 0;
        int evenSum = 0;

        while(num != 0){
            int ld = num % 10;
            if(ld % 2 == 0){
                evenSum = evenSum + ld;
            }
            else{
                oddSum = oddSum + ld;
            }
            num = num / 10;
        }

        if((evenSum != 0 && evenSum % 4 == 0) || (oddSum != 0 && oddSum % 3 == 0)){
            System.out.println("Can drive on Sunday");
        }
        else{
            System.out.println("Can't drive on Sunday");
        }

    }
}
