package week06_10_15_2022;

public class T2_countWords {
    public static void main(String[] args) {

         /*
    Task 2: Given a sentence which is string and count the words in it.

input:

  String str="Java is java in everywhere is Java";

  output:7
     */
        int space = 0;

        String str="Java is java in everywhere is Java";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ')
                space++;
        }
        System.out.println(space+1);






    }
}
