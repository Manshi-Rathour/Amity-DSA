package String;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int i1 = num1.length() - 1;
        int i2 = num2.length() - 1;
        String ans = "";
        int c = 0;

        while(i1>=0 && i2>=0){
            int d1 = num1.charAt(i1) - '0';
            int d2 = num2.charAt(i2) - '0';

            ans = (d1 + d2 + c) % 10 + ans;
            c = (d1 + d2 + c) / 10;

            i1--;
            i2--;
        }
        while(i1>=0){
            int d1 = num1.charAt(i1) - '0';
            ans = (d1 + c) % 10 + ans;
            c = (d1 + c) / 10;
            i1--;
        }
        while(i2>=0){
            int d2 = num2.charAt(i2) - '0';
            ans = (d2 + c) % 10 + ans;
            c = (d2 + c) / 10;
            i2--;
        }
        if(c>=1) ans = c + ans;

        return ans;
    }
    public static void main(String[] args) {
        String num1 = "11", num2 = "123";

        System.out.println(addStrings(num1, num2));
    }
}
