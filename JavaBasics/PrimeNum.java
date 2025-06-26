package JavaBasics;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.: ");
        int num = sc.nextInt();

        int p = 0;
        if(num==0 || num==1){
            p = 1;
        }

        for(int i=2; i<=num-1; i++){
            if(num%i==0){
                p = 1;
                break;
            }
        }

        if(p==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }
}
