package String;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String cm = strs[0];

        for(int i=1; i<n; i++){
            String s = strs[i];
            int temp = 0;
            for(int j=0; j<Math.min(s.length(), cm.length()); j++){
                if(s.charAt(j) != cm.charAt(j)){
                    cm = s.substring(0, j);
                    temp = 0;
                    break;
                }
            }

            if(temp == 0){
                if(s.length() < cm.length()){
                    cm = s;
                }
            }

            //cm = s.length() < cm.length()? s:cm;
        }
        return cm;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
