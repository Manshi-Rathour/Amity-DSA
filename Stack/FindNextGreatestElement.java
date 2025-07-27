package Stack;

public class FindNextGreatestElement {
    public static void find(int[] arr){
        int[] ans = new int[arr.length];

        for(int i = 0; i< arr.length; i++){
            ans[i] = -1;
            for(int j = i+1; j< arr.length; j++) {
                if (arr[i] < arr[j]) {
                    ans[i] = arr[j];
                    break;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(ans[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 2, 1, 6, -1};
        find(arr);
    }
}
