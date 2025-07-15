package Recursion;

public class AllPossiblePathsWithObstacles {
    public static void path(String ans, int cc, int cr, int dc, int dr, char[][] arr){
        if(cc == dc && cr == dr){
            System.out.println(ans);
            count++;
            return;
        }

        if(cc > dc || cr > dr) return;

        if(arr[cr][cc] != 'X'){
            // horizontal
            path(ans+"H", cc+1, cr, dc, dr, arr);
            // vertical
            path(ans+"V", cc, cr+1, dc, dr, arr);
            // diagonal
            path(ans+"D", cc+1, cr+1, dc, dr, arr);
        }
    }

    static int count = 0;

    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int cc = 0; // current column
        int cr = 0; // current row
        int dc = m-1; // dest column
        int dr = n-1; // dest row

        char[][] arr = {{' ', ' ', ' ', ' '},
                        {' ', ' ', 'X', ' '},
                        {' ', ' ', ' ', ' '},
                        {' ', 'X', 'X', ' '}};

        path("", cc, cr, dc, dr, arr);

        System.out.println(count);

    }
}
