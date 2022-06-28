package com.coding;

import java.util.*;

public class SetClass {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>(Arrays.asList("Hello", "World", "1", "2", "3","1", null));
        set.add("a");
        set.add("b");
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set<String> set1 = new TreeSet<String>(){{addAll(Arrays.asList("Hello1", "World", "1", "2", "3","1"));}};

//set1.forEach(el -> System.out.println(el));

        Set<String> set2 = new TreeSet<>();


    }
}
