package com.coding;

public class FIndJava {
    public static void main(String[] args) {
        String javaText = "Sometimes java language is hard, but when u used to do it it's becoming the most amazing language. Java is best language to start IT.";
String[] arr = javaText.split(" ");
int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase("java"))
            {
                count++;
            }

        }
        System.out.println(count);
    }
}
