package Heap;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    static class Points implements Comparable<Points>{
        int x;
        int y;
        int idx;
        int distSq;

        Points(int x, int y, int idx, int distSq){
            this.x = x;
            this.y = y;
            this.idx = idx;
            this.distSq = distSq;
        }
        @Override
        public int compareTo(Points p2){
            return this.distSq - p2.distSq;
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Points> pq = new PriorityQueue<>();
        for(int i=0; i<points.length; i++){
            int distSq = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.add(new Points(points[i][0], points[i][1], i, distSq));
        }

        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){
            Points p = pq.remove();
            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] arr = {{3,3},{5,-1},{-2,4}};
        int k = 2;

        int[][] ans = kClosest(arr, k);

        for (int[] an : ans) {
            System.out.print("[" + an[0] + ", " + an[1] + "]");
        }
    }
}
