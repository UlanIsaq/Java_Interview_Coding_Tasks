package com.coding;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;

public class Armstrong {
    public static void main(String[] args) {
        int num = 153;


Armstrong a = new Armstrong();
       if(a.isArmstrong(num))
       {
           System.out.println("The number is Armstrong");
       }
       else{
           System.out.println("The Number isn't armstrong");
       }

       //a.listOfArmstrongNumbers(900);
        System.out.println(a.isArmstrong1(153));
    }

    boolean isArmstrong(int num){

        int sum = 0;
        int number;
        StringBuilder s = new StringBuilder();
        s.append(num);
        for (int i = 0; i < s.length() ; i++) {
            number = Integer.parseInt(""+s.charAt(i));
            sum +=Math.pow(number,s.length());
        }

        return sum == num;
    }

    void listOfArmstrongNumbers(int limit){
        int sumNum =0;
        for (int i = 1; i < limit; i++) {
            String t = String.valueOf(i);
            int pow = t.length();

            for (int j = 0; j <pow ; j++) {
                int o = Integer.parseInt(""+t.charAt(j));
                sumNum += Math.pow(o,pow);
            }


if(sumNum == i){
    System.out.println(i);
}
sumNum = 0;
        }
    }

    boolean isArmstrong1(int num) {
        int digit = num;
int n;
int sum = 0;
int length = String.valueOf(num).length();
        while (digit != 0) {
            n=digit%10;
            digit=digit/10;
            sum += Math.pow(n,length);

        }
       return  (sum == num)? true:false;
    }
}
