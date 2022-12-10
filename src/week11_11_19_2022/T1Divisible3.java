package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class T1Divisible3 {
    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5,6,8,9};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(divisible3(list));
    }

    public static ArrayList<Integer> divisible3(ArrayList<Integer> list){
        ArrayList<Integer> div3 = new ArrayList<>();

        for (Integer each : list) {
            if (each%3==0){
                div3.add(each);
            }
        }
        return div3;
    }


}

/*
Task 1 :

Create a method that which is get array list as a parameter then return the numbers which are divisible by 3.

input:

  numbers : 2,3,4,5,6,8,9

output:

3,6,9
 */