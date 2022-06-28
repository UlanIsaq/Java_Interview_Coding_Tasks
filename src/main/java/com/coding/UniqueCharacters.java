package com.coding;

import java.util.*;

public class UniqueCharacters {
    /*
    Create a method that will accept a String and return a version
    that has only the unique characters.
     Ex: unique("AAABCCCDDEFFS") ==> ”BES"
     */
    public static void main(String[] args) {
uniqueString("AAABCCCDDEFFS");
countString("AAABCCCDDEFFS");
uniqueString1("AAABCCCDDEFFS");

    }
    public static void uniqueString(String str){
        String s = "";
        String[] d = str.split("");
        List<String> arr = Arrays.asList(d);
        for (String j:d) {
            int count = Collections.frequency(arr,j);
            if(count == 1) s+=j;

        }
        System.out.println(s);

    }
    public static void countString(String str){
        String s = "";
        String[] d = str.split("");
        List<String> arr = Arrays.asList(d);
        for (String j:d) {
            int count = Collections.frequency(arr,j);

            if(!s.contains(j)) {
                System.out.println(j+" : "+count);
            }
            s+=j;

        }


    }
    public static void uniqueString1(String str){
        String [] k =str.split("");
        String s = "";
        boolean unique;
        int count=0;
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k.length ; j++) {
                if(k[i].equalsIgnoreCase(k[j]) && i!=j&&k[i]!=null){
                    count++;
                }
            }

            if(count==0){
                s +=k[i];
            }

count =0;
        }
        System.out.println(s);
    }
}
