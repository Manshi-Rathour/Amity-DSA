package JavaBasics;

import java.util.Scanner;

public class StarPatterns2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int row = sc.nextInt();

        /* 1st

         * * * * *
         * * * *
         * * *
         * *
         *

         */
        int i = 1;
        while(i <= row){
            int j = row;
            while(j >= i){
                System.out.print("* ");
                j--;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        /* 2nd

         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5

         */
        int n = 1;
        while(n <= row){
            int m = 1;
            while(m <= n){
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
            n++;
        }

        System.out.println();

        /* 3rd

               *
             * * *
           * * * * *
         * * * * * * *

         */
        for(int p=1; p<n; p++){
            for(int q=1; q<=n-p; q++){
                System.out.print("  ");
            }
            for(int r=1; r<=(2*p-1); r++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
