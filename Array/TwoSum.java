package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 1, 0, 4, -1};

        boolean found = false;

        int target = 6;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i + ", " + j);
                    found = true;
                    break;
                }
            }
            if(found) break;
        }

        if(!found){
            System.out.println("Not Found");
        }

    }
}
