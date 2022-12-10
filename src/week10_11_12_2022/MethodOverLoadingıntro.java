package week10_11_12_2022;

public class MethodOverLoadingıntro {

    public static void main(String[] args) {
        // I wanna add to number

        int i= 23;
        double d= 21.5;
        float f = 23.5f; //(float) 23.5

        sum(i,d);
        sum(d,f);


    }

    private static void sum(double d, float f) {

    }

    public static void sum(int i, double d) {

    }

    /*
    we can not use method overloading only changing return type
    public static double sum(int i, double d) {

    }
*/
}
