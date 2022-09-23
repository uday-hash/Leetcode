public class two_sum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
        
        
    }

    public static void main(String[] args) {
        two_sum ts = new two_sum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = ts.twoSum(nums, target);
        for(int i : res){
            System.out.println(i);
        
    }
}
}
