/*A password is considered strong if the below conditions are all met:

It has at least 6 characters and at most 20 characters.
It contains at least one lowercase letter, at least one uppercase letter, and at least one digit.
It does not contain three repeating characters in a row (i.e., "...aaa..." is weak, but "...aa...a..." is strong, assuming other conditions are met).
Given a string password, return the minimum number of steps required to make password strong. if password is already strong, return 0.

In one step, you can:

Insert one character to password,
Delete one character from password, or
Replace one character of password with another character. */

package Strings;

public class Strong_password_checker {
    public int strongPasswordChecker(String password) {
        int res = 0, a = 1, A = 1, d = 1;
        char[] ch = password.toCharArray();
        int[] arr = new int[ch.length];
        for (int i = 0; i < ch.length;) {
            if (Character.isLowerCase(ch[i])) {
                a = 0;
            }
            if (Character.isUpperCase(ch[i])) {
                A = 0;
            }
            if (Character.isDigit(ch[i])) {
                d = 0;
            }
            int j = i;
            while (i < ch.length && ch[i] == ch[j]) {
                i++;
            }
            arr[j] = i - j;
        }
        int total_missing = (a + A + d);
        if (ch.length < 6) {
            res += total_missing + Math.max(0, 6 - (ch.length + total_missing));
        } else {
            int over_len = Math.max(ch.length - 20, 0), left_over = 0;
            res += over_len;
            for (int k = 1; k < 3; k++) {
                for (int i = 0; i < ch.length && over_len > 0; i++) {
                    if (arr[i] < 3 || arr[i] % 3 != (k - 1)) {
                        continue;
                    }
                    arr[i] -= Math.min(over_len, k);
                    over_len -= k;
                }
            }
            for (int i = 0; i < ch.length; i++) {
                if (arr[i] >= 3 && over_len > 0) {
                    int need = arr[i] - 2;
                    arr[i] -= over_len;
                    over_len -= need;
                }
                if (arr[i] >= 3) {
                    left_over += arr[i] / 3;
                }
            }
            res += Math.max(total_missing, left_over);
        }
        return res;
    
    }

    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaaaaaaa";
        Strong_password_checker obj = new Strong_password_checker();
        System.out.println(obj.strongPasswordChecker(s));
    }
    
    
}
