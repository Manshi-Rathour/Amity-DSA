package Recursion;

public class FindFirstOcc {
    public static int find(int[] arr, int idx, int target){
        if(idx>arr.length) return -1;

        if(arr[idx] == target){
            return idx;
        }
        int f = find(arr, idx+1, target);

        return f;
    }
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 3, 4, 6, 9, 0, 5};
        System.out.println(find(arr, 0, 9));
    }
}
