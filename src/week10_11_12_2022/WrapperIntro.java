package week10_11_12_2022;

import java.util.ArrayList;

public class WrapperIntro {

    public static void main(String[] args) {

        //int double char boolean

        int a = 2;
        Integer b = 122;
        Integer c = new Integer(12);

        // ArrayList<int> ar = new ArrayList<int>();   // we can not put primitive
        ArrayList<Integer> arrayList = new ArrayList<>(); // this is collection

        String number1 = "100";
        String number2 = "200";
        String result = number1 + number2;  //1002007
        System.out.println("result = " + result);
        //converting String to int
        int result1 = Integer.parseInt(number1); // 100
        int result2 = Integer.parseInt(number2); //200
        System.out.println(result1 + result2);

        System.out.println("--------------------------------------");
        //what is the difference between parseInt() and valueOf()
        //valueOf() returns an object (wrapper class)
        //parseInt() returns primitive data types

        int i = Integer.parseInt("123");
        Integer integer = Integer.valueOf("123");
        System.out.println(i + 2);

        //what is the difference between autoboxing and unboxing
        //autoboxing primitive ----->object (wrapper class)
        //unboxing object (wrapper) ------> primitive

        int i1 = 12;
        Integer integer1 = i1; //autoboxing primitive ----->object (wrapper class)
        Integer integer2 = 12;
        int i2 = integer2; //unboxing object (wrapper) ------> primitive




    }
}
