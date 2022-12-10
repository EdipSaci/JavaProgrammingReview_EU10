package week05_10_08_2022;

public class StringMethods {
    public static void main(String[] args) {
        // if we want to get special char    charAt()
        //             0123
        String str  = "Adam";
        System.out.println(str.charAt(0)); //first char
        System.out.println(str.charAt(3)); // fourth char

        //if we want to get the length of String length()

        System.out.println(str.length());
        int lengthOfString =str.length();
        int indexOfLasrChar = lengthOfString-1;
        System.out.println(str.charAt(indexOfLasrChar));

        //in order to make letters lower case toLoweCase()
        System.out.println(str.toLowerCase());

        //in order to remove spaces before and after your String  trim()
        String str1 = "    Adam  ";
        System.out.println(str.trim());

        //if you want to get index of char or String we need to use indexOf() method
        String number = "0123456";
        //get the index of 3
        System.out.println(number.indexOf('3'));
        // get the index of 34
        System.out.println(number.indexOf("34"));
        // get the index of 14
        System.out.println(number.indexOf("14"));  // it will return -1 means that there is no 14 in that String
        //                  01234567891011
        String sentence  = "Java is Java";
        System.out.println(sentence.indexOf("Java"));  // return me 0
        System.out.println(sentence.lastIndexOf("Java"));  // return me 8

        // if we want to replace some part of the string we need to use replace() or replaceFirst()

        String sentence1 = "Java is a hard prog language";
        System.out.println(sentence1.replace("hard", "easy"));
        String sentence2 = "java is not same with java";
        System.out.println(sentence2.replaceFirst("java", "C#"));

        // if we want to get some part of String we need to use substring()
        //             01234
        String subs = "Cydeo";
        // get the yde from this
        System.out.println(subs.substring(1, 4));
        // get the Cy from this
        System.out.println(subs.substring(0, 2));
        // get the deo from this
        System.out.println(subs.substring(2));
        // get the ydeo from this
        System.out.println(subs.substring(1));

        //if we want to repeat one word we need to use repeat method
        String str4 = "Adam";
        System.out.println(str4.repeat(4));

        // if we want to check our String is empty or not we need to use isEmpty method
        String emptyWord =" "; // isEmpty method is checking length
        System.out.println(emptyWord.isEmpty());

        // if we want to check our String is blank or not we need to use isBlank method
        String blankWord = "    ";  // it is check spaces
        System.out.println(blankWord.isBlank());

        // if we want to compare two String values with exact matching we can use equals()

        // if we want to compare two String values with matching (lower case or upper case) we can use equalIgnorecase()
        String str6 ="Word";
        String str7 ="word";
        System.out.println(str6.equals(str7)); // false
        System.out.println(str6.equalsIgnoreCase(str7));  // true

        // startsWith with method is using for checking the String is starting with char sequence or not
        // endsWith with method is using for checking the String is ending with char sequence or not
        String sentence5 ="Java is good language";
        System.out.println(sentence5.startsWith("Java"));
        System.out.println(sentence5.endsWith("language"));

        // contains method is using for checking the given char sequence is in String or not
        String sentence6 = "Java is Java";




    }
}
