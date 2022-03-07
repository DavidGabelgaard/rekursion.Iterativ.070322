package com.company;



public class Main {

    public static void main(String[] args) {

        System.out.println(recursivePos(4,4));

        System.out.println(recursiveFak(5));

        System.out.println(fib(12));

        System.out.println(secondPow(5));

        System.out.println(addNumbersUpTo(5));

        int [] array = new int[] {1 , 3 , 5, 1, 7 , 1};

        //System.out.println(count(  1 , array , array.length -1    ));

         reverseDisplay("Marc");

        reverseDisplayInt(array , array.length -1 );

    }

    public void dec2Hex() {



    }

    public static void reverseDisplay(String s) {
        System.out.println();

        for (int i = s.length() - 1; i >= 0 ; i--) {
            System.out.print(s.charAt(i));
        }

    }

    public static void reverseDisplayInt(int[] array , int index) {
        if (index != -1) {
            System.out.println(array[index]);
            reverseDisplayInt(array, index - 1);
        }
    }

    public static int count(int lookFor, int[] array, int arraySize ) {
        int result  = 0;

        if (arraySize >= 0)
            result = ( count(lookFor , array , arraySize - 1) + ( ( lookFor == array[arraySize] ) ? 1 : 0 ) );

        return  result;
    }

    public static int addNumbersUpTo(int n) {
        if (n == 1)
            return 1;
        else
            return n + addNumbersUpTo(n-1);
    }

    public static int secondPow(int n) {
        if (n == 1)
            return 2;
        else
            return 2 * secondPow(n -1);
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

    public static  int recursivePos(int x , int n) {
        if (n == 0)
            return 1;
        else
            return x*recursivePos(x,n-1);
        }

    public static int recursiveFak(int n) {

            if (n == 1)
                return  1;
            else
                return n * recursiveFak(n - 1);



        }



    }




