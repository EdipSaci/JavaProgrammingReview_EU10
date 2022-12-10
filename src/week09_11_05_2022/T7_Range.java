package week09_11_05_2022;

public class T7_Range {
    public static void main(String[] args) {

       boolean result = in1020(10,15);
        System.out.println(result);
    }
    public static boolean in1020 (int num1, int num2){
        return (num1 <20 && num1>10) || (num2<20 && num2>10);
    }
}
