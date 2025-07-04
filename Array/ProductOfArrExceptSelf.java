package Array;

public class ProductOfArrExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int[] leftProd = new int[n];
        int[] rightProd = new int[n];

        // left product
        leftProd[0] = 1;
        for(int i=1; i<n; i++){
            leftProd[i] = leftProd[i-1] * nums[i-1];
        }

        // right product
        rightProd[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            rightProd[i] = rightProd[i+1] * nums[i+1];
        }

        // left * right
        for(int i=0; i<n; i++){
            answer[i] = leftProd[i] * rightProd[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 9};

        int[] answer = productExceptSelf(arr);

        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i] + " ");
        }

    }
}
