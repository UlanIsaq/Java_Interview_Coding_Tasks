package com.coding;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayList {
    public static void main(String[] args) {
        System.out.println(sortedList(new ArrayList<>(Arrays.asList(1,4,8,3,7,9))));
    }

    public static ArrayList<Integer> sortedList(ArrayList<Integer> list) {
        //1,4,8,3,7,9
        int max;
        int temp;
        for (int j = 0; j < list.size(); j++) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(j) < list.get(i)) {

                max = list.get(j);
                temp = list.get(i);
                list.set(i, max);
                list.set(j, temp);
               // System.out.println(list);
            }
        }

        }

        return list;
    }
}
