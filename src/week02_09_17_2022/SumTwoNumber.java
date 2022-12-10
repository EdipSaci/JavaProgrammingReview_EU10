package week02_09_17_2022;

public class SumTwoNumber {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber =20;
        int sum =firstNumber+secondNumber;

        System.out.println(sum);
        System.out.println("sum = " + sum);

        System.out.println(firstNumber+ "+" +secondNumber+ " = " + sum);
        System.out.println(firstNumber+ "+" +secondNumber+ " = " +firstNumber+secondNumber);
        System.out.println(firstNumber+ "+" +secondNumber+ " = " +(firstNumber+secondNumber));

        int a =30;
        String s = "30";
        String res= s + a;
        String s1 = s + a;

        // String+ int  concatenation
        // automatically assign for windows alt+enter+enter
        System.out.println(res);

    }
}
