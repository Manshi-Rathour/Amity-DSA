package JavaBasics;

public class Loop {
    public static void main(String[] agrs){
//        int n = 1;
//        while(n<=100){
//            if(n%2 == 0){
//                System.out.println(n);
//            }
//            n++;
//        }
//


        int n = 2;

        while(n<=5){
            int i = 1;
            while(i<=10){
                System.out.print(n*i + " ");
                i++;
            }
            System.out.println();
            n++;
        }
    }
}
