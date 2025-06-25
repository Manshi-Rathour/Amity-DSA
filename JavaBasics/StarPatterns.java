package JavaBasics;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows: ");
        int row = sc.nextInt();

        int n = 1;
         while(n<=row){
             int m = 1;
             while(m<=5){
                 System.out.print("* ");
                 m++;
             }
             System.out.println();
             n++;
         }

        System.out.println();

         int i = 1;
         while(i<=row){
             int j = 1;
             while(j<=i){
                 System.out.print("* ");
                 j++;
             }
             System.out.println();
             i++;
         }

         sc.close();
    }
}
