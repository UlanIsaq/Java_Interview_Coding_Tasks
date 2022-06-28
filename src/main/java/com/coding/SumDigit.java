
package com.coding;


public class SumDigit {

    public static void main(String[] args) {
        String str = "24dcF0b123L2100ty)0";
        System.out.println(sum(str));
    }

    public static Integer sum(String str) {
        int num = 0;
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                temp += str.charAt(i);
                if (i == str.length() - 1 || !Character.isDigit(str.charAt(i + 1))) {
                    num += Integer.parseInt(temp);
                    temp = "";
                }

            }
        }

        return num;
    }


}
