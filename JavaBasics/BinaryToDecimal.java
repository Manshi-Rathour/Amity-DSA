package JavaBasics;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number: ");
        int num = sc.nextInt();

        int sum = 0;
        int i = 0;

        while(num != 0){
            int d = num % 10;
            if(d == 1){
                sum = sum + (int)Math.pow(2, i);
                num = num/10;
            }
            else{
                num = num/10;
            }
            i++;
        }
        System.out.println(sum);
    }
}
