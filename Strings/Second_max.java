package Strings;

public class Second_max {
    public int secondMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                secondMax = max;
                max = nums[i];
            } else if(nums[i] > secondMax){
                secondMax = nums[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        Second_max obj = new Second_max();
        int[] nums = {2, 3, 4, 5};
        System.out.println(obj.secondMax(nums));
    }
}
