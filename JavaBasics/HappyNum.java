package JavaBasics;

import java.util.Scanner;

/*

32 is a happy number:
32 -> 3² + 2² = 9 + 4 = 13
13 -> 1² + 3² = 10
10 -> 1² + 0² = 1
1 -> 1² = 1

*/

public class HappyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no.: ");
        int num = sc.nextInt();
        int temp = 0;

        for(int i=1; i<=1000; i++){
            int sum = 0;
            while(num > 0){
                sum = sum + (num%10) * (num%10);
                num = num / 10;
            }

            if(sum == 1){
                temp = 1;
                System.out.println("No. of iterations: " + i);
                break;
            }
            num = sum;
        }

        System.out.println(temp==1?"Happy":"Unhappy");

    }
}
