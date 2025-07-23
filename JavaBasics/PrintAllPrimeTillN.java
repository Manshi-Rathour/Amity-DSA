package JavaBasics;

public class PrintAllPrimeTillN {
    public static void prime(int num){
        int p = 0;
        if(num==0 || num==1){
            p = 1;
        }

        for(int i=2; i<=num-1; i++){
            if(num % i == 0){
                p = 1;
                break;
            }
        }

        if(p==0){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        for(int i=1; i<=100000; i++){
            prime(i);
        }
    }
}
