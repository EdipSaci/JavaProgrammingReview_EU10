package week03_09_24_2022;

public class SingleAndDoubleAnd {
    public static void main(String[] args) {

        boolean result = false;
        int a = 10;
             //false it will look at this statement and increment the value
        if (result& a++ < 12){
        }

        System.out.println(a); //11

        int b = 10 ;
         // false it will not look at the rest
        if (result&& b++ < 11){
        }




    }
}
