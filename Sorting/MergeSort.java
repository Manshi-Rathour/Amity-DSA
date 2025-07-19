package Sorting;

public class MergeSort {
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
    public static int[] sort(int si, int ei, int[] arr){

        if(si == ei){
            int a[] = new int[1];
            a[0] = arr[si];
            return a;
        }

        int mid = (si + ei)/2;

        int fa[] = sort(si, mid, arr);
        int sa[] = sort(mid+1, ei, arr);

        int[] merged = merge(fa, sa);

        return merged;
    }

    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 5, 3, 11, 4};

        int[] arr_sorted = sort(0, arr.length-1, arr);

        for(int i=0; i<arr_sorted.length; i++){
            System.out.print(arr_sorted[i] + " ");
        }
    }
}
