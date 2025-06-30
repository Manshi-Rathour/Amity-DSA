package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 0, 6, -1, 3, 2, -5};
        int target = 3;

        boolean found = linearSearch(arr, target);
        System.out.println(found);
    }
    public static boolean linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
