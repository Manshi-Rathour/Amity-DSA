package Backtracking;

public class NumberOfIslands {
    public static void fillOneToZero(char[][] grid, int row, int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0'){
            return;
        }
        grid[row][col] = '0';

        fillOneToZero(grid, row-1, col); // up
        fillOneToZero(grid, row+1, col); // down
        fillOneToZero(grid, row, col-1); // left
        fillOneToZero(grid, row, col+1); // right
    }
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        int count = 0;

        for(int i=0; i< grid.length; i++){
            for(int j=0; j< grid[i].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    fillOneToZero(grid, i, j);
                }
            }
        }

        System.out.println(count);
    }
}
