package com.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
//        List<String> maxArray = new ArrayList<>();
//        maxArray.add("Alpha");
//        maxArray.add("Beta");
//        for (String num : maxArray) {
//            System.out.println(num);
//        }
        List<Integer> listOfnums = new ArrayList<>(Arrays.asList(1, 2, 3, 45, 67, 89, 2, 0, -1, -122, 300, 123));


        int maxNumber = new FindMax().findMaxNumber(listOfnums);
        System.out.println(maxNumber);

    }

    public Integer findMaxNumber(List<Integer> listOfNum) {
        int maxInt = Integer.MIN_VALUE;
        for (int num : listOfNum) {
            if (num > maxInt) {
                maxInt = num;
            }
        }
        return maxInt;
    }
}
