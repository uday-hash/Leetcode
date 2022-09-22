/*
 * You wrote down many positive integers in a string called num. However, you realized that
 *  you forgot to add commas to seperate the different numbers. You remember that the list of integers was non-decreasing and that no integer had leading zeros.

Return the number of possible lists of integers that you could have written 
down to get the string num. Since the answer may be large, return it modulo 109 + 7.

Constraints:

1 <= num.length <= 3500
num consists of digits '0' through '9'.

 */

package Strings;

public class Num_od_ways_to_separate_num {
    public int numberOfCombinations(String num) {
        int n = num.length();
        int mod = (int)1e9 + 7;
        int[] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; i++){
            if(num.charAt(i) != '0'){
                dp[i] = dp[i - 1];
            }
            if(num.charAt(i - 1) != '0' && Integer.parseInt(num.substring(i - 1, i + 1)) <= 26){
                if(i == 1){
                    dp[i]++;
                } else {
                    dp[i] = (dp[i] + dp[i - 2]) % mod;
                }
            }
        }
        return dp[n - 1];
    }
    
}
