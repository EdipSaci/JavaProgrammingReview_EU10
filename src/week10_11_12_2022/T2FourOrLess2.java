package week10_11_12_2022;

import java.util.Arrays;

public class T2FourOrLess2 {
    public static void main(String[] args) {

        String[] array = {"apples", "tree", "loop", "cat", "animal", "shortcut"};
        String str = "";
        for (String each : array) {

            if(each.length() <= 4)
                str += each + ",";

        }

        String[] arr = str.split(",");

        System.out.println(Arrays.toString(arr));

    }

}
