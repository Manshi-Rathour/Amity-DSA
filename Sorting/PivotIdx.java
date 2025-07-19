package Sorting;

public class PivotIdx {
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
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 11, 3, 4};
        int pi = find(0, arr.length-1, arr);

        System.out.println(pi);

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
