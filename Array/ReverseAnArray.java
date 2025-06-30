package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements: ");

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr){
        int n = arr.length-1;
        for(int i=0; i<n; i++, n--){
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
    }
}
