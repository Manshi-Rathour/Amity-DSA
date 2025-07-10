package TwoDArray;

import java.util.ArrayList;
import java.util.Collections;

public class DiagonalTraverse {
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

    public static void diagonalTraverse(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;

        for(int row=0; row < rows; row++){
            int r = row;
            int c = 0;
            int diagonalIndex = row;

            if (diagonalIndex % 2 == 0){
                while(r >= 0 && c < cols){
                    System.out.print(arr[r][c] + " ");
                    r--;
                    c++;
                }
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                while(r >= 0 && c < cols){
                    list.add(arr[r][c]);
                    r--;
                    c++;
                }
                Collections.reverse(list);
                for(int i=0; i<list.size(); i++){
                    System.out.print(list.get(i) + " ");
                }
            }
        }

        for(int col=1; col < cols; col++){
            int r = arr.length - 1;
            int c = col;
            int diagonalIndex = (rows - 1) + col;

            if (diagonalIndex % 2 == 0) {
                while(c < cols && r >= 0){
                    System.out.print(arr[r][c] + " ");
                    r--;
                    c++;
                }
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                while(c < cols && r >= 0){
                    list.add(arr[r][c]);
                    r--;
                    c++;
                }
                Collections.reverse(list);
                for(int i=0; i<list.size(); i++){
                    System.out.print(list.get(i) + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        print(arr);
        System.out.println();
        diagonalTraverse(arr);
    }
}