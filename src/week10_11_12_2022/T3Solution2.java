package week10_11_12_2022;

import java.util.Arrays;

public class T3Solution2 {
    public static void main(String[] args) {
        String[] array = {"123", "134", "513"};

        int [] result = new int[array.length];
        int index =0;
        
        // I need to get each string
        for (String each : array) {
            System.out.println(each);
            String[] eachDigit = each.split("");
            int total =0;
            for (String s : eachDigit) {
                int i = Integer.parseInt(s);
                total+=i;
            }
            System.out.println(Arrays.toString(eachDigit));
            System.out.println(total);
            result[index++]= total;
        }
        System.out.println(Arrays.toString(result));
        //I need o get each digit
        //I can use parseInt() method

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
