package String;

public class CharactersCount {
    public static void main(String[] args) {
        String s = "aaabccbcabd";
        int arr[] = new int[26];

        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i) - 'a';

            arr[idx]++;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0) {
                System.out.println((char) ('a' + i) + " " + arr[i]);
            }
        }

    }
}
