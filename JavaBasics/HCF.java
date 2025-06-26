package JavaBasics;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the number2: ");
        int num2 = sc.nextInt();

        int hcf = 1;

        for(int i=2; i<=Math.min(num1, num2); i++){
            if(num1%i == 0 && num2%i == 0){
                hcf = i;
            }
        }

        System.out.println("HCF: " + hcf);
    }
}
