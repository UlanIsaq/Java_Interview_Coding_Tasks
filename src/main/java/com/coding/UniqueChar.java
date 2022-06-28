package com.coding;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueChar {

    public static void main(String[] args) {
        String str = "Hello world applea";
        //uniqueChar("Hello world applea");
        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
        Set<String> set1 = new TreeSet<>(Arrays.asList(str.split("")));
        Stream<String> stream = set.stream();
        stream.forEach(e-> System.out.print(e));

//        Stream<String> stream1 = set1.stream();
//        stream1.forEach(e-> System.out.print(e+", "));
    }

    static void uniqueChar(String string) {
        String[] arr = string.split("");
        String unique = "";
        for (String s : arr) {
            int number = Collections.frequency(Arrays.asList(arr), s);
            if (number == 1) {
                unique += s +", ";
            }
        }
        System.out.println(unique);
    }
}
