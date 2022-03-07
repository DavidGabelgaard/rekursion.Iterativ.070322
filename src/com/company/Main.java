package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(pow(4,4));

        System.out.println(fak(5));

        System.out.println(fib(12));


    }


    public static int pow (int x, int n) {
        int timesValue = x;
        if (n == 0) {
            return  1;
        }
        for (int i = 1; i < n; i++) {
            x *= timesValue;
        }
        return  x;
    }


    public static int fak(int n) {
        int sum = n;
        for (int i = n-1; i > 0; i--) {
            sum *= i;
        }
        return sum;
    }

    public static int fib(int n) {


        if (n == 1) {
            return 1;
        }

        int nr1= 0;
        int nr2 = 1;
        int returnNumber = 0;

        for (int i = 1; i < n; i++) {
            returnNumber = nr1 + nr2;
            nr1 = nr2;
            nr2 = returnNumber;
        }
        return returnNumber;
    }



}
