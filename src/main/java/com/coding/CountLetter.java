package com.coding;

import java.util.HashMap;
/*
    Create a method that will accept a String
    and be print how many times each characters
    is found in the String
     */
public class CountLetter {
    public static void main(String[] args) {
        String str = "applles0";
        HashMap<Character, Integer> map = new HashMap<>();
      map.put('a', 0);
        map.put('p', 1);
        map.put('p', 2);
        map.put('l', 3);
        map.put('e', 4);
        map.put('s', 5);

//        for (Character key:map.keySet()) {
//            System.out.println(key+" value: "+map.get(key));
//        }

       // countLetter(str);

//        String str1 = map.toString().replaceAll("\\{","")
//                .replaceAll("}","")
//               .replaceAll(",","")
//        .trim();

countChar(str);

        }

    static void countChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 0);
            }
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);


        }

        for (Character key:map.keySet()) {
            System.out.println(key+" value: "+map.get(key));
        }

    }

    public static void countLetter(String str){

        String str1 = str;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char key = str1.charAt(i);
            if (!map.containsKey(key)) {
                map.put(key, 0);
            }
            int d = map.get(key);
            System.out.println(d);
            map.put(key, map.get(key)+1);
            System.out.println(d);
        }

        for (Character key :map.keySet()) {
            System.out.print("Key: "+key);
            System.out.println(" value: "+map.get(key));
        }
          }


}
