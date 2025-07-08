package String;

public class GoodStringOrNot {
    public static void main(String[] args) {
        String s = " aeiouAEzxmp**$# ";

        int v = 0;
        int c = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if((ch >= 'a' && ch <='z') || (ch >='A' && ch <= 'Z')){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    v++;
                }
                else{
                    c++;
                }
            }
        }

        if(v > c){
            System.out.println("Good String");
        }
        else{
            System.out.println("Not a good string");
        }
    }
}
