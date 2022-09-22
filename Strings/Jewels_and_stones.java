package Strings;

public class Jewels_and_stones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(Character.toString(stones.charAt(i)))) {
                count++;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        numJewelsInStones obj = new numJewelsInStones();
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(obj.numJewelsInStones(jewels, stones));

    }
}

