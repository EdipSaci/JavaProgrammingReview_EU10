package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {
    public static void main(String[] args) {

        //how to create an array list
        ArrayList<String> cities = new ArrayList<>();
        //how to add element
        cities.add("London");  //returns boolean
        cities.add("Paris");
        cities.add("Rome");

        System.out.println(cities); // [London, Paris, Rome]
        cities.add(1,"USA");
        System.out.println(cities);//[London, USA, Paris, Rome]

       // cities.add(5,"Tokyo");
        //System.out.println(cities); //.IndexOutOfBoundsException

        //how to get element
        System.out.println(cities.get(0));//London

        //how to update your element
        cities.set(1,"Sincan");
        System.out.println(cities);//[London, Sincan, Paris, Rome]
                                //      0       1       2     3
        //how to learn index of element
        System.out.println(cities.indexOf("Sincan")); //1
        System.out.println(cities.indexOf("Ank")); // -1


        //lastIndexOf()
        System.out.println(cities.lastIndexOf("Paris")); //2


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(1);
        numbers.add(1);
        System.out.println(numbers); // [1, 1, 2, 3, 4, 5, 1, 1]
                                //index   0  1  2  3  4  5  6  6
        System.out.println(numbers.indexOf(1));// 0
        System.out.println(numbers.lastIndexOf(1)); //7

        //how to remove a element
        numbers.remove(3);
        System.out.println(numbers); //[1, 1, 2, 4, 5, 1, 1]

        Integer b = 5;
        numbers.remove(b);
        System.out.println(numbers); //[1, 1, 2, 4, 1, 1]

        numbers.remove(new Integer(4));
        System.out.println(numbers); // [1, 1, 2, 1, 1]

        //bulk operations

        // addAll()
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mehmet","osman","kemal","ziya"));

        System.out.println("---------------------------------");
        System.out.println(numbers); //[1, 1, 2, 1, 1]

        //removeAll()
        numbers.removeAll(numbers);
        System.out.println(numbers);  //[]

        //removeIf()
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        list.removeIf(p-> p>5);
        System.out.println(list); //[1, 2, 3, 4, 5]

        //retainAll()
        list.retainAll(Arrays.asList(1,2,3));
        System.out.println(list); //[1, 2, 3]
    }
}
