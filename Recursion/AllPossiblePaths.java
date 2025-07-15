package Recursion;

public class AllPossiblePaths {
    public static int path(String ans, int cc, int cr, int dc, int dr){
        if(cc == dc && cr == dr){
            System.out.println(ans);
//            count++;
            return 1;
        }

        if(cc > dc || cr > dr) return 0;

        // horizontal
        int h = path(ans+"H", cc+1, cr, dc, dr);
        // vertical
        int v = path(ans+"V", cc, cr+1, dc, dr);

        return h+v;
    }

//    static int count = 0;

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int cc = 0; // current column
        int cr = 0; // current row
        int dc = m-1; // dest column
        int dr = n-1; // dest row

        int total = path("", cc, cr, dc, dr);
        System.out.println("Total possible paths: " + total);

//        System.out.println("Total possible paths: " + count);

    }
}
