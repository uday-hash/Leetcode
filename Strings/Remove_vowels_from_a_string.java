package Strings;

import java.util.Scanner;

public class Remove_vowels_from_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String str1 = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println("The string after removing vowels is " + str1);
        sc.close();
    }
}
