package week09_11_05_2022;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        int [] firstArray ={1,2,3};
        int [] secArray ={1,2,3};
        int [] thirdArray ={1,2,3};
                                // 0 1 2    0 1 2    0 1 2  3
        int[][] twoDimenArray = { {1,2,3} ,{4,5,6}, {7,8,9,10}};
        //   0        1          3
        int[][]array2D ={firstArray,secArray,thirdArray};

        System.out.println(twoDimenArray[0][1]);  // 2
        System.out.println(twoDimenArray[2][2]); // 9
                            // 3
        for (int i = 0; i < twoDimenArray.length; i++) {// in order to go to array one by one
            System.out.println(i+1 + " . array");
            for (int j = 0; j < twoDimenArray[i].length; j++) { // finding element inside the  inner array1
                System.out.println(twoDimenArray[i][j]);
            }
            System.out.println("-----------------");
        }

    }

}
