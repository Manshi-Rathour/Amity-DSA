package Array;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int i = 0;
        int j = arr.length - 1;

        while(i <= j){
            int mid = (i+j)/2;

            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) j = mid - 1;
            else i = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 11, 44, 88};
        System.out.println(binarySearch(arr, 44));
    }
}
