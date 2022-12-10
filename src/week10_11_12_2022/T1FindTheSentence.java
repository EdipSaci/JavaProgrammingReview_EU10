package week10_11_12_2022;

public class T1FindTheSentence {

    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

        getSentence(str);

    }

    private static void getSentence(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //it is for English letters
            //if we want to see other letters we can use isLetter()
            if (Character.isUpperCase(ch)){
                result+=" ";
            }
            if (Character.isLetter(ch)){
                result+=ch;
            }
        }
        System.out.println(result);
    }

}/*
                    Task 1 : Find the word
                    String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
                    Write a method that returns : Welcome To Core Java
                    */
