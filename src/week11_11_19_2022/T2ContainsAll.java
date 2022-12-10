package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class T2ContainsAll {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6));

        int [] merge =(containsAll(list1, list2));

        System.out.println(Arrays.toString(merge));
    }


    public static int [] containsAll( ArrayList<Integer> list1,ArrayList<Integer> list2){
        int [] array = new int[list1.size()+list2.size()];

        int i = 0;
        for (Integer each : list1) {
            array[i++]=each;
        }


        for (Integer each : list2) {
            array[i++]=each;
        }
        return array ;
    }
}

/*
Task 2 :

Create a method that get two arraylists as a parameters the return the array which has contains all elements in it.

input:

first arraylist :1,2,3

second arraylist :4,5,6

output:

1,2,3,4,5,6

 */
