package com.coding;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
String[] text = {"alkatras", "chloe", "tamara", "yankee", "bravo","whisky","delta","echo","x-ray","golf", "kilo","foxtrot"};
ArraySort arraySort = new ArraySort();
arraySort.sort(text);
    }
    public void sort(String [] arr){
        String[] sortedArr = arr;
        int i = 0;
        while(i <=sortedArr.length) {
            for (int j = 0; j < sortedArr.length-1; j++) {
                if (sortedArr[j].charAt(0) > sortedArr[j + 1].charAt(0)) {
                    String mid = sortedArr[j + 1];
                    sortedArr[j + 1] = sortedArr[j];
                    sortedArr[j] = mid;
                }
            }
            i++;
        }
        System.out.println(Arrays.toString(sortedArr));
        }
    }

