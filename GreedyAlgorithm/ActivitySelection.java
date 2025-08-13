package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

//        ans.add(0);
//        maxAct = 1;
//        int lastEnd = end[0];
//
//        for(int i=1; i<end.length; i++){
//            if(start[i] >= lastEnd){
//                maxAct++;
//                ans.add(i);
//                lastEnd = end[i];
//            }
//        }

        // if end[] is not sorted

        int[][] activities = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, (a, b) -> a[2] - b[2]);

        ans.add(activities[0][0]);
        maxAct = 1;
        int lastEnd = activities[0][2];
        for(int i = 1; i< end.length; i++){
            if(activities[i][1] > lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activity: " + maxAct);

        for(int i=0; i<ans.size(); i++){
            System.out.println("A" + ans.get(i));
        }


    }
}
