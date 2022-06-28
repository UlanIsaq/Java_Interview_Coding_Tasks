package com.coding;

public class Fibonacci {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    public static void main(String[] args) {
       // Fibonacci(15);
        Fibo1(15);
    }

    static void Fibonacci(long num) {
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + "," + num2);
        for (int i = 0; i < num; i++) {
            if (i == (num1 + num2)) {
                System.out.print(", " + i);
                num1 = num2;
                num2 = i;
            }
        }
        System.out.println();
    }

    static void Fibonacci1(long num) {
        int num1 = 0;
        int num2 = 1;
        //
        for (int i = 0; i < num; i++) {
            if (i + num1 == 1) {
                System.out.print(", " + i);
                num1 = num2;
                num2 = i;
            }
        }
        System.out.println();
    }

    static void Fibo(int num) {
        int zero = 0;
        int one = 1;
        int next = 0;
       while(next<15) {
            next = zero +one;
            System.out.println(next+", ");

            zero = one;
                    one=next;
        }
    }
    static void Fibo1(int num) {
        int first =0;
        int second = 1;
        int sum = 0;
        for (int i = 0; i < num ;i++) {
           i=first+second;
            System.out.println(i);
            first = second;
            second = i;



        }
    }

}
