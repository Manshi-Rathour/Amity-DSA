package JavaBasics;

// Boston Num => sum of the digits of num = sum of the digits of factors of that num

import java.util.Scanner;

public class BostonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.: ");

        int num = sc.nextInt();

        // Sum of Factors
        int n = num;
        int factSum = 0;
        int i = 2;
        while(n>1){
            if(n%i == 0){
                System.out.print(i + ", ");

                // Sum of digits of the factor
                int j = i;
                while(j > 0){
                    int ld = j%10;
                    factSum = factSum + ld;
                    j = j/10;
                }

                n = n / i;
            }
            else{
                i++;
            }
        }

        System.out.println();
        System.out.println("Fact Sum: " + factSum);


        // Sum of the digits of num
        n = num;
        int digitSum = 0;
        while(n > 0){
            int ld = n%10;
            digitSum = digitSum + ld;
            n = n/10;
        }
        System.out.println("Digit Sum: " + digitSum);


        // Checking Factors sum is equal to Digit sum or not
        if(factSum == digitSum){
            System.out.println("Boston Number");
        }
        else{
            System.out.println("Not a Boston Number");
        }
    }
}
