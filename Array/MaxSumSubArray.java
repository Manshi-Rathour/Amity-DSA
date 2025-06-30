package Array;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, -9, -2, 1, 4, 5, 6};
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum = sum + arr[j];

                if(max < sum){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
