package Array;

public class PeakIndexInMountainArray {
    public static int peakIndexInMountainArray(int[] arr){
        int i = 0;
        int j = arr.length;

        while(i<j){
            int mid = (j-i)/2 + i;

            if(arr[mid] < arr[mid + 1]) i = mid + 1;
            else j = mid;
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 5, 2, 1};

        System.out.println(peakIndexInMountainArray(arr));
    }
}
