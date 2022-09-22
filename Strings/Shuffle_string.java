package Strings;

public class Shuffle_string {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
        
    }
    public static void main(String[] args) {
        Shuffle_string obj = new Shuffle_string();
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(obj.restoreString(s, indices));
    }
    
}
