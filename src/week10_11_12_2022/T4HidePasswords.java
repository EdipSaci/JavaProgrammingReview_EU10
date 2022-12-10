package week10_11_12_2022;

import java.util.Arrays;

public class T4HidePasswords {
    public static void main(String[] args) {

        String [] array = {"one", "hi", "hold"};
        String [] arr = new String[array.length];
        int  i = 0;
        for (String each : array) {

            System.out.println(each);
            String [] each1 = each.split("");
            String result = "";
            for (int k =0; k<each1.length; k++) {
                result+="*";
            }
            arr[i++] = result;
        }
        System.out.println(Arrays.toString(arr));


    }
}

/*
Task 4 : Hide Passwords
                    Given an array of passwords (String). Hide each password as a star (*) and show the hidden password
                    Ex:
                    Input:
                    {"one", "hi", "hold}
                    Output:
                    [ ***, **, **** ]
 */