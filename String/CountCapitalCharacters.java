package String;

public class CountCapitalCharacters {
    public static void main(String[] args) {
        String s = "aBAsdM";

        int count = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
        }
        System.out.println(count);
    }
}
