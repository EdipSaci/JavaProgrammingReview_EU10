package week09_11_05_2022;

public class T5_DifferenceWith21 {
    public static void main(String[] args) {
        int result = diff21(19);  // 21-19=2 return 2
        int result2 = diff21(23);  // 23-21 =2  return 2+2

        System.out.println(result2);
        System.out.println(result);


    }
    public static int diff21(int number) {
        return (number < 21) ? 21 - number : (21 - number) * 2;

    }
}
/*
Task 5 :  Write a method that return the absolute difference between n and 21, except return double the absolute difference if n is over 21. (n is int)

    method  parameter : no , or what kind of data type --- integer
    method return type : void? --- integer
             diff21(19) → 2
             diff21(10) → 11
             diff21(23) → 4
 */
