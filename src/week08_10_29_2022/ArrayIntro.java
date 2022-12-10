package week08_10_29_2022;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        // if we know the elements of array
        int[] arrayName = {1,2,3,4,5,6};

        //if we don't know the elements we have to define size of array
        // use new keyword

        int[] array = new int[6];
        array[0]= 10;
        array[1]= 10;
        array[2]= 10;
        array[3]= 10;
        array[4]= 10;
        array[5]= 10;

        //print the elements we need to use toString() method with Arrays utility class
        System.out.println(Arrays.toString(array));
        //                0    1     2    3
        char[] letters ={'B', 'S', 'D', 'Y'};
        System.out.println(Arrays.toString(letters));
        // how the get specific element
        System.out.println(letters[1]);  // S

        boolean[] array1= new boolean[3];
        array1[0] = false;

        double[] doubles= new double[2];
        doubles[1] = 10;

        //sort method is sorting elements to small to bigger
        int[] number ={2,3,1,10,5};
        System.out.println(Arrays.toString(number));
        System.out.println("---------------after sort----------");
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        // equals method is using for compare two array  !order of elements is ımportant

        int[] array3 = {1,2,3};
        int[] array4 = {2,1,3};

        System.out.println(Arrays.equals(array3,array4));
        Arrays.sort(array4);
        System.out.println(Arrays.equals(array3,array4));




    }
}
