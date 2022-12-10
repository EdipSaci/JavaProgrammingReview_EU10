package week05_10_08_2022;

public class LoopIntro {
    public static void main(String[] args) {
        // if we repeat one action more than one we can use loop
        String str = "0123456";
        str.charAt(0);  // get the first char
        str.charAt(1);  // get the second char
                            // index <= str.length()-1
        for (int index = 0; index<str.length(); index++){
            System.out.println(str.charAt(index));
        }
        // write the even number from 0 to 100

        for (int i = 0; i <= 100; i++) {
            System.out.print(i);
        }
        // write the even numbers from 0 to 100 is included
        for (int i = 0; i <=100; i+=2) {
            System.out.println(i);
        }




    }
}
