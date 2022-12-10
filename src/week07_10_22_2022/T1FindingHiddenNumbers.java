package week07_10_22_2022;

import java.util.Random;
import java.util.Scanner;

public class T1FindingHiddenNumbers {

    public static void main(String[] args) {
        /*
         Task 1: Find the number that given a hidden number between 1 and 100 randomly created.

 Hint:   Random random=new Random();

        int hiddenNumber = random.nextInt(100) + 1;
         */
        Random random = new Random();
                            // create a number from 0(inclusive) to 10 (exclusive)
        int hiddenNumber = random.nextInt(10) + 1 ; // we have one number in that variable from  1 to 10

        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("enter a number");
            int searchNumber = scan.nextInt();
            if (searchNumber==hiddenNumber){
                System.out.println("you find the number. Congrats!");
                flag=false;
            }else {
                System.out.println("try again");
            }

        }while (flag);



    }
}
