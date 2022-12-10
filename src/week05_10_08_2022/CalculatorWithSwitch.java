package week05_10_08_2022;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        double n1 = scan.nextInt();

        System.out.println("please enter second num");
        double n2 = scan.nextDouble();

        System.out.println("please enter your operator");
        char operator =scan.next().charAt(0);
        //we dont have nextChar() method so we need to use our String method which is charAt()
        double result = 0 ;

        switch (operator){

            case '+' :
                result= n1+n2;
                break;
            case '-' :
                result= n1-n2 ;
                break;
            case  '*' :
                result= n1*n2;
                break;
            case '/' :
                result= n1/n2 ;
                break;
            default:
                System.out.println("operator is wrong");

        }

        scan.close();

        System.out.println("result = " + result);



    }
}
