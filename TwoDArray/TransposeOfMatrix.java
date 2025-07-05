package TwoDArray;

public class TransposeOfMatrix {
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

    public static void printTranspose(int[][] arr){

        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{5, 3, 1, 4}, {-1, 2, 3, 4}, {2, 3, 2, 4}};

        print(arr);

        System.out.println();

        printTranspose(arr);
    }
}