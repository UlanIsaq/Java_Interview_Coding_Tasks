package com.coding;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1= "silent";// ilents
        String str2 = "listen";
        Anagram an = new Anagram();
      //  System.out.println(an.isAnagram2(str1,str2));
     //   an.isAnagram(str1, str2);

        System.out.println(an.toSort(str1));

    }

    boolean isAnagram1(String str1, String str2){

        if(str1.length() != str2.length())return false;
        String text1 =sort1(str1);
        String text2 = sort1(str2);

        if(text1.equalsIgnoreCase(text2)){ return true;}


       return false;
    }

    boolean isAnagram2(String str1, String str2){
        String t1 = str1; String t2 = str2;

        if(str1.length() != str2.length())return false;

        for (int i = 0; i < str1.length(); i++) {

            t1 =t1.replaceFirst(t2.charAt(i)+"","");

        }

        if(t1.isEmpty()){
            return true;
        }
        return false;
    }

    String sort1(String str){
       char[] strArr = str.toCharArray();
       char temp;
        String text="";
        int l=0;
        while (strArr.length-1-l !=0) {
            for (int i = 0; i < strArr.length; i++) {

                if (i != strArr.length - 1 && strArr[i] > strArr[i + 1]) {
                    temp = strArr[i + 1];
                    strArr[i + 1] = strArr[i];
                    strArr[i] = temp;

                }
            }
            l++;
        }
        for (char a:strArr) {
            text +=a;
        }
        return text;//3524109298
    }

    public boolean isAnagram(String str1, String str2) {
String [] arr1  =str1.split("");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        String sortedStr1 = "";

        for (String s:arr1) {
            sortedStr1 +=s;
        }
        System.out.println(sortedStr1);

        return true;
    }

   String toSort(String str){

        int k = 0;
       char bigger;
       char smaller;
       char temp;
       char[] unsorted=str.toCharArray();
       String sortedString = "";
        while (k<unsorted.length) {
            for (int i = 0; i < unsorted.length-1; i++) {
               if(unsorted[i]>unsorted[i+1]){
                   temp = unsorted[i+1];
                   unsorted[i+1]=unsorted[i];
                   unsorted[i] = temp;

               }
            }
            k++;
        }
sortedString = Arrays.toString(unsorted).replaceAll("\\[","")
.replaceAll("]","")
.replaceAll(",","")
        .replaceAll(" ","")
        .trim();
        return sortedString;
   }

}
