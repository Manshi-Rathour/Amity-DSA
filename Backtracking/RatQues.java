package Backtracking;

// 0 shows obstacles and 1 shows path to take

public class RatQues {
    public static void find(String ans, int row, int col, int[][] board){
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] == 0){
            return;
        }

        if(row == board.length - 1 && col == board[0].length - 1){
            System.out.println(ans);
            return;
        }

        board[row][col] = 0;

        // up
        find(ans+"U", row-1, col, board);
        // down
        find(ans+"D", row+1, col, board);
        // left
        find(ans+"L", row, col-1, board);
        // right
        find(ans+"R", row, col+1, board);

        board[row][col] = 1;

    }
    public static void main(String[] args) {
        int[][] board = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        find("", 0, 0, board);
    }
}
