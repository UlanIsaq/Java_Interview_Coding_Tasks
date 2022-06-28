package com.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstDublicate {
    public static void main(String[] args) {
        List<Integer> listOfNums = new ArrayList<>(Arrays.asList(1,2,3,5,66,4,2,66,0,-7,-7,11,109));
        System.out.println(findDuplicate(listOfNums));



    }
    public static Integer findDuplicate(List<Integer> nums){
        List<Integer> duplicate = new ArrayList<>();
        for (Integer num:nums) {
            if(duplicate.contains(num))
            {
            return num;
            }else
            {
                duplicate.add(num);
            }
        }
        return 0;
    }
}
