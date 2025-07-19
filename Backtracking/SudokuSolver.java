package Backtracking;

public class SudokuSolver {
    public static boolean isSafe(int val, int row, int col, char[][] board){

        char ch = (char)(val + '0');

        // row
        for(int i=0; i< board[0].length; i++){
            if(ch == board[row][i]){
                return false;
            }
        }

        // col
        for(int i=0; i< board.length; i++){
            if(ch == board[i][col]){
                return false;
            }
        }

        // grid
        row = row - (row % 3);
        col = col - (col % 3);
        for(int i=row; i<row+3; i++){
            for(int j=col; j<col+3; j++){
                if(ch == board[i][j]) return false;
            }
        }


        return true;

    }
    public static void fill(int row, int col, char[][] board){
        if(col == 9){
            row++;
            col = 0;
        }

        if(row == 9){
            print(board);
            return;
        }

        if(board[row][col] != '.'){
            fill(row, col+1, board);
        }
        else{
            for(int i=1; i<=9; i++){
                if(isSafe(i, row, col, board)){
                    board[row][col] = (char)((int)'0' + i);
                    fill(row, col+1, board);
                    board[row][col] = '.';
                }
            }
        }
    }

    public static void print(char[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        fill(0, 0, board);
    }
}
