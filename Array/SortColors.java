package Array;

public class SortColors {
    public static void sortColors(int[] nums) {
        int i = 0;
        int start = 0;
        int end = nums.length - 1;

        while(i<=end){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
                i++;
            }
            else if(nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
            else{
                i++;
            }
        }
    }
    public static void printArr(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 2, 0, 1, 2, 1};
        sortColors(nums);
        printArr(nums);
    }
}
