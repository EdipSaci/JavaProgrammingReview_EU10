package week08_10_29_2022;

import java.util.Arrays;

public class T2MultipleWords {
    public static void main(String[] args) {
        /*
        Task 2 :    Write a program that accepts string and prints multiple words in the string
        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer"
          output : wooden spoons
                 trash can
                  dish washer
         */
        String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String[] words = str.split(", ");
        for (String each : words) {
            if (each.contains(" ")){
                System.out.println(each);
            }
        }



    }
}
