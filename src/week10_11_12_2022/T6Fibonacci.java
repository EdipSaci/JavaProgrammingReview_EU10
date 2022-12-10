package week10_11_12_2022;

import java.util.Arrays;
import java.util.Scanner;

public class T6Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number= scan.nextInt();
        int [] result =fibonacciArray(number);

        System.out.println(Arrays.toString(result));
        printFibonacci(number);
        System.out.println();
        String result3 =fibonacciNumbers(number);
        System.out.println(result3);

    }
    public static void printFibonacci (int index){
        int [] num = fibonacciArray(index);
        for (int each : num) {
            System.out.print(each+" ");
        }
    }
    public static String fibonacciNumbers(int index){
        String result = "";
        for (int each : fibonacciArray(index)) {
            result+=each+" ";
        }
        return result;
    }

    public static int[] fibonacciArray (int index){
        int [] num = new int[index];
        for (int i = 0; i < index; i++) {
            if (i<=1){
                num[i]=i;
            }
            if (i>1){
                num[i]= num[i-1]+ num[i-2];
            }
        }
        return num;
    }


}
/*

Task 6 :  Fibonacci
                Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.

                Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

                Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

                    Ex:
                        Input:
                            8
                        Output:
                            0, 1, 1, 2, 3, 5, 8, 13, 21

                            1- Create one method and only print the numbers
                            2- You will return the numbers
                            3- Yuo will put that numbers into the array then you will return it

 */