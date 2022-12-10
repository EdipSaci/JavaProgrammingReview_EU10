package week10_11_12_2022;

import java.util.Arrays;

public class T3SumOfNumbers {

    public static void main(String[] args) {
        String[] array = {"123", "134", "513"};
        int [] result =sumOfNumbers(array);
        System.out.println(Arrays.toString(result));

    }

    public static int[] sumOfNumbers(String[] array) {
        int [] result = new int[array.length];
        int index = 0;
        for (String s : array) {
            int each = Integer.parseInt(s);
            int sumOfDigits = sumDigits(each);
            result[index++]=sumOfDigits;
        }
        return  result;
    }

    public static int sumDigits(int each) {
        //123
        int lastDigit=each%10;
        int middleDigit=each/10%10;
        int firstDigit=each/100;
        return firstDigit+middleDigit+lastDigit;
    }
}
/*
Task 3 : String numbers to sum
                    Given an Array of numbers in String format, add each digit of each element and store into a different Array.
                    Ex:
                    Input:
                    “123”, “134”, “513”
                    Output:
                    [ 6, 7, 9 ]


 */
