package DialyProgrammingChallenge;

public class Day8 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));     // "blue is sky the"
        System.out.println(reverseWords("  hello world  "));     // "world hello"
        System.out.println(reverseWords("a good   example"));    // "example good a"
        System.out.println(reverseWords("    "));                // ""
        System.out.println(reverseWords("word"));
    }

    public static String reverseWords(String s){
        s = s.trim();

        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = words.length-1; i >= 0 ; i--) {
            sb.append(words[i]);

            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
