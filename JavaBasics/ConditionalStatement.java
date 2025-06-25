package JavaBasics;
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//        if(age<10){
//            System.out.println("Can't sit on front seat");
//        }
//        else if(age>=10 && age<16){
//            System.out.println("Can sit on front seat but can't drive");
//        }
//        else if(age>=16 && age<18){
//            System.out.println("Can have learning driving licence");
//        }
//        else{
//            System.out.println("Can drive");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter visa: ");
        char v = sc.next().charAt(0);

        System.out.print("Enter amount: ");
        double a = sc.nextInt();

//        if(v=='A'){
//            if(a>100000){
//                System.out.println("Ultra");
//            }
//            else if(a<1000000 && a>=50000){
//                System.out.println("Rich");
//            }
//            else{
//                System.out.println("Avg");
//            }
//        }
//        else{
//            if(a>100000){
//                System.out.println("Rich");
//            }
//            else if(a<1000000 && a>=50000){
//                System.out.println("Middle class");
//            }
//            else{
//                System.out.println("Avg");
//            }
//        }


        if(a>100000){
            if(v=='A'){
                System.out.println("ultra");
            }
            else if(v=='B'){
                System.out.println("rich");
            }
        }
        else if(a<100000 && a>=50000){
            if(v=='A'){
                System.out.println("rich");
            }
            else if(v=='B'){
                System.out.println("middle class");
            }
        }
        else{
            System.out.println("Avg");
        }
    }
}
