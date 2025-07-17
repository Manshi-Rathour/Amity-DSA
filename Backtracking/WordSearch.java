package Backtracking;

public class WordSearch {
    public static boolean find(int row, int col, int i, char[][] board, String word, int[][] visit){

        if(i == word.length()) {
            return true;
        }
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length){
            return false;
        }

        if(board[row][col] != word.charAt(i) || visit[row][col] == 1){
            return false;
        }

        visit[row][col] = 1;

        boolean up = find(row-1, col, i+1, board, word, visit);
        boolean down = find(row+1, col, i+1, board, word, visit);
        boolean left = find(row, col-1, i+1, board, word, visit);
        boolean right = find(row, col+1, i+1, board, word, visit);

        visit[row][col] = 0;

        return (up || down || left || right);
    }
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        String word = "ABCCED";

        int[][] visit = new int[board.length][board[0].length];

        for(int i=0; i< board.length; i++){
            for(int j=0; j< board[i].length; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean check = find(i, j, 0, board, word, visit);
                    if(check == true){
                        System.out.println(true);
                        return;
                    }
                }
            }
        }
    }
}
