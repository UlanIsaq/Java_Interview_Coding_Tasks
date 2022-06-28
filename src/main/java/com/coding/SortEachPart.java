package com.coding;

import java.util.ArrayList;
import java.util.Arrays;

public class SortEachPart {
    /*
    Input: "DC501GCCCA098911"
    OutPut: "CD015ACCCG011899"
     */
    public static void main(String[] args) {
       System.out.println(sortedEachPart("DC501GCCCA098911"));
        //System.out.println(sortingString("DC501GCCCA098911"));
        char c = '9';
        //System.out.println(Character.isDigit(c));
    }

    public static String sortedEachPart(String str) {
        String each = "";
        String sortedEach = "";
        for (int i = 0; i < str.length() ; i++) {
            each += str.charAt(i);
            if(Character.isLetter(str.charAt(i))){

               if(i == str.length() - 1 || !Character.isLetter(str.charAt(i+1))){
                   sortedEach +=sortingString(each);
                   each="";
               }
           }
           if (Character.isDigit(str.charAt(i))) {
               if(i == str.length() - 1 || !Character.isDigit(str.charAt(i+1))){

                   sortedEach +=sortingString(each);
                   each = "";
               }
           }
        } 
        return sortedEach;
    }

    public static String sortingString(String s) {
String[] ss = s.split("");
        String b = "";
        Arrays.sort(ss);
        for (String a:ss) {
            b +=a;
        }
        return b;
    }
    
    
}
