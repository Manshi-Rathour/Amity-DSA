package Stack;

import java.util.Stack;

public class DailyTemperatures {
    public static int[] find(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int idx = st.pop();
            ans[idx] = 0;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};

        int[] ans = find(temperatures);

        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
