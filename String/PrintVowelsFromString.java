package String;

public class PrintVowelsFromString {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.print("Vowels in " + s + ": ");
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.print(ch + " ");
            }
        }
    }
}
