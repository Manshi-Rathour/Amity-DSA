package Sorting;

public class QuickSort{
    public static int find(int si, int ei, int[] arr){
        int pi = si;
        int item = arr[ei];

        for(int i=si; i<ei; i++){
            if(item > arr[i]){
                int temp = arr[pi];
                arr[pi] = arr[i];
                arr[i] = temp;
                pi++;
            }
        }
        int temp = arr[pi];
        arr[pi] = item;
        arr[ei] = temp;

        return pi;
    }

    public static void sort(int si, int ei, int[] arr){
        if(si > ei) return;

        int pi = find(si, ei, arr);

        sort(si, pi-1, arr);
        sort(pi+1, ei, arr);
    }
    public static void main(String[] args) {
        int[] arr = {6, 1, 3, 8, 2, 10, 4};

        sort(0, arr.length-1, arr);

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}