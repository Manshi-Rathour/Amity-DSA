package TwoDArray;

public class SpiralMatrix {
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
    public static void spiralMatrix(int[][] arr){
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[0].length - 1;

        while(top <= bottom && left <= right){

            // left to right
            for(int i = left; i<= right; i++){
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // top to bottom
            for(int i = top; i <= bottom; i++){
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // right to left
            for(int i = right; i >= left; i--){
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;


            // bottom to top
            for(int i = bottom; i >= top; i--){
                System.out.print(arr[i][left] + " ");
            }
            left++;
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        print(arr);
        System.out.println();

        System.out.println("Spiral print: ");
        spiralMatrix(arr);
    }
}
