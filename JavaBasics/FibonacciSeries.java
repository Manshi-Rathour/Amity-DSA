package JavaBasics;

public class FibonacciSeries {
    static int fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args){

        System.out.println("Using Recursion: ");

        int n = 0;

        while(n<10){
            System.out.print(fibonacci(n) + " ");
            n++;
        }

        System.out.println();

        System.out.println("Using while loop: ");

        int first = 0, sec = 1, i = 0;

        while(i<10){
            System.out.print(first + " ");
            int next = first + sec;
            first = sec;
            sec = next;
            i++;
        }
    }
}
