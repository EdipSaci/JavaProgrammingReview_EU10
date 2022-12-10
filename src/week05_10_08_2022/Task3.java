package week05_10_08_2022;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3: Given a string, return a version without the first and last char, so "Hello" yields "ell".
      Hint: The string length will be at least 2.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();
        String result = "";
        if (word.length()<2){
            result = "";
        }else {
            System.out.println(word.substring(1,word.length()-1));
        }

    }
}
