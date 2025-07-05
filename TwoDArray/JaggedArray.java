package TwoDArray;

public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][];
        arr[0] = new int[5];
        arr[1] = new int[4];
        arr[2] = new int[2];
        arr[3] = new int[6];

        // Initializing array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }
        // Displaying the values of 2D Jagged array
        System.out.println("2D Jagged Array");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
