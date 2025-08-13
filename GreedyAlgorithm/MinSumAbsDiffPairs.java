package GreedyAlgorithm;

import java.util.Arrays;

public class MinSumAbsDiffPairs {
    public static void main(String[] args) {
        int[] A = {4, 1, 7, 8};
        int[] B = {2, 3, 6, 5};

        Arrays.sort(A);
        Arrays.sort(B);

        int minAbsSum = 0;

        for(int i=0; i<A.length; i++){
            minAbsSum += Math.abs(A[i] - B[i]);
        }

        System.out.println(minAbsSum);
    }
}
