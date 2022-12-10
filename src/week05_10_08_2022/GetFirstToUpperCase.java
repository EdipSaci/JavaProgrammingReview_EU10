package week05_10_08_2022;

import java.util.Scanner;

public class GetFirstToUpperCase {
    public static void main(String[] args) {
        /*
        Task 1: Given a string, print the string made of its first two chars,
        so the String "Hello" or "hello" yields "HE".
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.nextLine();
        String result ="" + word.charAt(0) + word.charAt(1);
        String result2 = word.charAt(0) + "" +word.charAt(1);
        System.out.println(result.toUpperCase());
        System.out.println(result2.toUpperCase());



    }
}
