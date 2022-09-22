package Strings;

public class Max_words_found_in_sentences {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            if (words.length > max) {
                max = words.length;
            }
        }
        return max;
        
    }
    public static void main(String[] args) {
        Max_words_found_in_sentences obj = new Max_words_found_in_sentences();
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(obj.mostWordsFound(sentences));
    }
}
