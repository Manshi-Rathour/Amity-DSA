package Sorting;

public class BubbleSort {
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;

        for(int i=0; i<n; i++){
            swapped = false;
            for(int j=0; j<(n-i-1); j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 9, 5, 3, 8};

        System.out.println("Original Array: ");
        printArr(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array: ");
        printArr(arr);
    }
}
