package JavaBasics;

import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.: ");
        int n = sc.nextInt();

        int i = 2;
        while(n>1){
            if(n%i == 0){
                System.out.print(i + ", ");
                n = n / i;
            }
            else{
                i++;
            }
        }
    }
}