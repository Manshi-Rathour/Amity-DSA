package Trie;

public class WordBreakProblem {
    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1; i<=key.length(); i++){
            if(CreatingTrie.search(key.substring(0, i)) &&
                wordBreak(key.substring(i))){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};

        for(int i=0; i< words.length; i++){
            CreatingTrie.insert(words[i]);
        }

        String key = "ilikesamsung";

        System.out.println(wordBreak(key));
    }
}
