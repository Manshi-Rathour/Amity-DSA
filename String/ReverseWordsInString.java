package String;

public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        String s = "the      sky is blue ";
        System.out.println(reverseWords(s));

    }
}
