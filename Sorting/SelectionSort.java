package Sorting;

public class SelectionSort {
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n; i++){
            int min_idx = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 9, 5, 3, 8};

        System.out.println("Original Array: ");
        printArr(arr);

        selectionSort(arr);

        System.out.println("Sorted Array: ");
        printArr(arr);
    }
}
