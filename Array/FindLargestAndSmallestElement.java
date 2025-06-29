package Array;

public class FindLargestAndSmallestElement {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 1, 0, 4, -1};

//        int l = arr[0];
//        int s = arr[0];

        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > l){
                l = arr[i];
            }
            if(arr[i] < s){
                s = arr[i];
            }
        }

        System.out.println("Largest: " + l);
        System.out.println("Smallest: " + s);

    }
}
