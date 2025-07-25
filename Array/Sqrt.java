package Array;

public class Sqrt {
    public static int mySqrt(int x) {
        int i = 0;
        int j = x;

        while(i<=j){
            int mid = (j-i)/2 + i;
            long val = (long)mid * mid;

            if(val == x) return mid;
            else if(val > x) j = mid - 1;
            else i = mid + 1;
        }
        return j;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(81));
    }
}
