package com.coding;

import java.util.*;

public class DeleteDublicate {
    public static void main(String[] args) {
        String text = "AADDDVVVFFCVFGXXRTKJHGLLQ";

//        String[] arr = text.split("");
//
//        Set <String> arrSet = new HashSet<>(Arrays.asList(arr));
//        Set<String> arrLinked = new LinkedHashSet<>(Arrays.asList(arr));
//
//        System.out.println(arrSet);
//        System.out.println(arrLinked);
//        Iterator itr = arrLinked.iterator();
//String str="";
//        while (itr.hasNext()) {
//            str += itr.next()+", ";
//        }
//        System.out.println(str);
//String str1;
//        str1 = str.substring(0,str.length()-2);
//        System.out.println(str1);

        toDeleteDuplicates(text);
    }

    static String toDeleteDuplicates(String string) {
        char[] arr=string.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char s : arr) {
            if (!map.containsKey(s)) {
                map.put(s, 0);
            }
            map.put(s, map.get(s) + 1);

        }

//                      map.keySet().forEach(e -> {
//                          if(map.get(e) == 1){
//                              System.out.println(e);
//                          }
//                      });

        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Object s = it.next();
            if(map.get(s)==1){
                System.out.println(s);
            }
        }

        for (char s:map.keySet()) {
            if(map.get(s)==1){
                System.out.print(s);
            }

        }








        return "dele";
    }
}
