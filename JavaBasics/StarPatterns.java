package JavaBasics;

public class StarPatterns {
    public static void main(String[] args){
        int n = 1;
         while(n<=5){
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
         while(i<=5){
             int j = 1;
             while(j<=i){
                 System.out.print("* ");
                 j++;
             }
             System.out.println();
             i++;
         }
    }
}
