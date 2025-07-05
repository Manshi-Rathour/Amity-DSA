package TwoDArray;

public class DiagonalPrint {
    public static void print(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printDiagonally(int[][] arr){
        for(int row=0; row< arr.length; row++){
            int r = row;
            int c = 0;
            while(r >= 0 && c < arr[0].length){
                System.out.print(arr[r][c] + " ");
                r--;
                c++;
            }
        }

        for(int col=1; col<arr[0].length; col++){
            int r = arr.length - 1;
            int c = col;

            while(c <  arr[0].length && r >= 0){
                System.out.print(arr[r][c] + " ");
                r--;
                c++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        print(arr);
        System.out.println();
        printDiagonally(arr);

    }
}
