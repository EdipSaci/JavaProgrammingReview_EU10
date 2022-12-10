package week05_10_08_2022;

import java.util.Scanner;

public class ThreeCopyOfLastTwoChar {
    public static void main(String[] args) {
        /*
        Task 2: Create a logic print a new string made of 3 copies of the last 2 chars of the original string.

      Hint: The string length will be at least 2
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();


       String result = "" +word.charAt((word.length())-2)+ word.charAt((word.length())-1);

        System.out.println(result+result+result);

    }
}
