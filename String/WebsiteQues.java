package String;

public class WebsiteQues {
    public static void main(String[] args) {
        String s = "hacks.codingblocks.com/app/contest/8283/43";
        s = s.trim();

        String[] words = s.split("/");
//        String[] words = s.split("\\.");
        int n = words.length;

        for(int i=0; i<words.length; i++){
            if(i == 0){
                System.out.println("Website: " + words[i]);
            }
            else if(i == n-2){
                System.out.println("Contest id: " + words[i]);
            }
            else if(i == n-1){
                System.out.println("Ques no.: " + words[i]);
            }
            else{
                System.out.println("Page: " + words[i]);
            }
        }
    }
}
