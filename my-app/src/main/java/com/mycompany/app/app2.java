package com.mycompany.app;

public class app2 {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return ;
    }

    public static void main(String[] args) {
        System.out.println(app2.isPalindrome("ababa"));
    }
}
