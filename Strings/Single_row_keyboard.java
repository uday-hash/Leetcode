package Strings;

public class Single_row_keyboard {
    public int calculateTime(String keyboard, String word) {
        int time = 0;
        int prev = 0;
        for (int i = 0; i < word.length(); i++) {
            int curr = keyboard.indexOf(word.charAt(i));
            time += Math.abs(curr - prev);
            prev = curr;
        }
        return time;
    }
    public static void main(String[] args) {
        Single_row_keyboard obj = new Single_row_keyboard();
        String keyboard = "pqrstuvwxyzabcdefghijklmno";
        String word = "leetcode";
        System.out.println(obj.calculateTime(keyboard, word));
    }
    
}
