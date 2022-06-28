package com.coding;

public class PrimeNumber {
    public static void main(String[] args) {
        int num  = 7;
        System.out.println(isPrimeNumber(num));
    }
    static boolean isPrimeNumber(int num){

        for(int i = 2;i<num;i++){
            if(num % i ==0){
                System.out.println(num+" devide to "+i+" answer: "+(num/i)+" "+(num%i));
                return false;
            }

        }
return true;
    }


}
