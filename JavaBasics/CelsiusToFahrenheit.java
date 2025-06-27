package JavaBasics;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        for(int i=20; i<=100; i=i+2){
            double f = (i * 1.8) + 32;

            System.out.println(i + " C = "+ (int)f + " F");
        }
    }
}
