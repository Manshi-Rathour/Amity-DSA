package Questions;

import java.util.*;

class StockSpanner {
    Stack<int []> st;   // 0th -> day & 1st -> price

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        int day = 1;

        while(!st.isEmpty() && st.peek()[1] <= price){
            int arr[] = st.pop();
            day = day + arr[0];
        }
        int[] narr = new int[2];
        narr[0] = day;
        narr[1] = price;

        st.push(narr);

        return day;
    }
}

public class StockSpan {
    public static void main(String[] args) {
        StockSpanner s = new StockSpanner();

        System.out.println(s.next(100));
        System.out.println(s.next(80));
        System.out.println(s.next(60));
        System.out.println(s.next(70));
        System.out.println(s.next(60));
        System.out.println(s.next(75));
        System.out.println(s.next(85));
    }
}
