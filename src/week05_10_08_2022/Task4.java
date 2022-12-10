package week05_10_08_2022;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Task 4: Given a string, if the string begins with "red" or "blue" print that color string,
        otherwise print the empty string.

     *                 input :"redxx" → "red"
     *                 input :"xxred" → ""
     *                 input :"blueTimes" → "blue"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String str = scan.next();
        String word1 =str.substring(0,3);
        String word2 =str.substring(0,4);

        if (word1=="red"){
            System.out.println(word1);
        } else if (word2=="blue") {
            System.out.println(word2);
        }else {
            System.out.println("");
        }


    }
}
