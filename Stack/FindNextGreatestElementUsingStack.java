package Stack;

import java.util.Stack;

public class FindNextGreatestElementUsingStack {
    public static int[] find(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                int idx = st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int idx = st.pop();
            ans[idx] = -1;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 2, 1, 6, -1};

        int[] ans = find(arr);

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
