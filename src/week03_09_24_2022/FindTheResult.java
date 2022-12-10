package week03_09_24_2022;

public class FindTheResult {
    public static void main(String[] args) {

        int a = 30;
        boolean remainder3 = a%3 ==0,
                remainder5 = a%5 ==0,
                remainder15= a%15==0;
        if (remainder3){
            System.out.println(a+20);
        } else if (remainder5) {
            System.out.println(a+25);
        } else if  (remainder15) {
            System.out.println(a+50);
        }


    }
}
/*
Task 6: Create a class which is "FindTheResult" create a variable
    int a=15;
         if a is divisable by 3 add 20
         if a is divisable by 5 add 25
         if a is divisable by 15 add 50
 */