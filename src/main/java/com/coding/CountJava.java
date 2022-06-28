package com.coding;

public class CountJava {
    /*
    "java is fun. java is the best";
     */
    public static void main(String[] args) {
        System.out.println(new CountJava().count("java is fun. java is the best"));
        countJ("java is fun. java is the best j***");
    }

    public Integer count(String string) {
        String str = string;
        int count = 0;
        for (int i = 0; i < str.length() - 4; i++) {
            if (str.substring(i, i + 4).equalsIgnoreCase("java")) count++;
        }
        return count;
    }



    public static void countJ(String s){
        String[] arr = s.split(" ");
        int count = 0;
        for (String word: arr) {
            if (word.equalsIgnoreCase("java")) count++;
        }
        System.out.println(count);
    }
}
