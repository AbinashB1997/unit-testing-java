package com.mycompany.app;

public class app1 {
    public static int countOnes(String str) {
        int cnt = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '1') {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(app1.countOnes("10101010"));
    }
}