package JavaBasics;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int sum = 0;
        int i = 1;

        System.out.println("Factors are: ");

        while(i <= num/2){
            if(num % i == 0){
                System.out.print(i + ", ");
                sum = sum + i;
            }
            i++;
        }

        System.out.println();
        System.out.println("Sum of factors: " + sum);

        if(sum == num){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not a Perfect Number");
        }

    }
}
