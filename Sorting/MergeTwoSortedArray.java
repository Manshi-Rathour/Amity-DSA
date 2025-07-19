package Sorting;

public class MergeTwoSortedArray {
    public static int[] merge(int[] arr1, int[] arr2){
        int[] ans = new int[arr1.length + arr2.length];

        int i1 = 0;
        int i2 = 0;
        int i = 0;
        while(i1 < arr1.length && i2 < arr2.length){
            if(arr1[i1] < arr2[i2]){
                ans[i] = arr1[i1];
                i1++;
            }
            else{
                ans[i] = arr2[i2];
                i2++;
            }
            i++;
        }

        while(i1 <  arr1.length ){
            ans[i] = arr1[i1];
            i1++;
            i++;
        }

        while(i2 <  arr2.length ){
            ans[i] = arr2[i2];
            i2++;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 7, 11, 21};
        int[] arr2 = {2, 5, 6, 13, 20};

        int[] ans = merge(arr1, arr2);

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
