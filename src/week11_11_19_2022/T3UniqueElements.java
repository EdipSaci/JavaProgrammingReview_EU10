package week11_11_19_2022;

import java.util.ArrayList;

public class T3UniqueElements {
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {4,5,6};
        ArrayList<Integer> result = new ArrayList<>(unique(arr1,arr2));
        System.out.println(result); // [1, 2, 3, 4, 5, 6]
    }

    public static ArrayList<Integer> unique (int [] arr1 , int [] arr2){
        ArrayList<Integer> list=new ArrayList<>();

        for (int each : arr1) {
            if (!list.contains(each)){
                list.add(each);
            }
        }
        for (int each : arr2) {
            if (!list.contains(each)){
                list.add(each);
            }
        }

        return list;
    }

}
/*
Task 3 :
Create a method that get two arrays as a parameters then return the arraylist which has contains unique elements in it.
first array :1,2,3,4,5
second array :4,5,6
output:
1,2,3,4,5,6
 */