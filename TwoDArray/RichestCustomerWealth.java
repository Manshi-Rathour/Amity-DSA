package TwoDArray;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int ans = 0;

        for(int i=0; i<m; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum = sum + accounts[i][j];
            }

            if(ans < sum){
                ans = sum;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(maximumWealth(arr));
    }
}
