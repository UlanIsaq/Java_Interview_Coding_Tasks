package com.coding;

public class Palindrome {
    public static void main(String[] args) {
       // System.out.println(isPalindrome(12321));
        System.out.println(isStringPalindrome2("abcdcb"));
        String text = "abcdcba1";

        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(text.length()-1-i));
        }
    }

    static boolean isPalindrome(long num){//12321

        long remain = num;
        long digit=0;
        long rev = 0;
        while (remain!=0){
            digit=remain%10;
            rev=rev*10+digit;
            remain /=10;
        }
        System.out.println(rev);

        return rev == num;
    }

    static boolean isStringPalindrome1(String text){
        String reversetext="";
        for (int i = text.length()-1; i >=0; i--) {
            //System.out.println(text.charAt(i));
            reversetext += text.charAt(i);
        }
        return reversetext.equalsIgnoreCase(text);
    }
    static boolean isStringPalindrome2(String text){
        String reversetext="";
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)!=text.charAt(text.length()-1-i)){
                return false;
            }

        }
        return true;
    }
}
