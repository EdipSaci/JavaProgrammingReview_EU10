package week09_11_05_2022;

public class T1_EvenOrOdd {
    public static void main(String[] args) {
        checkEvenOrOdd(5);

    }
    public static void checkEvenOrOdd (int number){
        if (number%2==0){
            System.out.println(number+" is even");
        }else {
            System.out.println(number+ " is odd");
        }
    }
}
/*
 Task 1 :   Write a method that can check if a number is even or odd
 */