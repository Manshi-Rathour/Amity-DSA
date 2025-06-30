package Array;

public class SwapingOfTwoNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7};

        swap(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int[] arr){
        int temp = arr[4];
        arr[4] = arr[1];
        arr[1] = temp;
    }
}
