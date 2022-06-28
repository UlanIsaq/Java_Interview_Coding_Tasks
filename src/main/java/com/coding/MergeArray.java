package com.coding;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
//        int[] arr1={1,2,34,67,89,7};
//        int[]arr2={2,5,76,87,90};
//
//        System.out.println(Arrays.toString(concatTwoArrays(arr1,arr2)));
        String[] arr1 = {"element1", "element2","element4"};
        String[] arr2 = {"element3", "element5","element6"};
        System.out.println(Arrays.toString(concatTwoArraysString(arr1,arr2)));

    ArraySort arraySort = new ArraySort();
    arraySort.sort(arr1);

    }
    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int i = 0;
        int[] result= new int[arr1.length+arr2.length];
        for (int num:arr1) {
            result[i++]=num;
        }
        for(int num:arr2){
            result[i++]=num;
        }
        Arrays.sort(result);
       return result;
    }

    public static String[] concatTwoArraysString(String[] arr1, String[]arr2){
        String[] result = new String[arr1.length+arr2.length];
        int i = 0;
        for (String text:arr1) {
result[i++] = text;
        }
        for (String text:arr2) {
            result[i++] = text;
        }
        Arrays.sort(result);
        return result;
    }

}

