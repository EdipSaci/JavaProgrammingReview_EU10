package week06_10_15_2022;

public class T1_countSpecificWord {
    public static void main(String[] args) {
        /*
        Task 1: Given a sentence which is string find word how many times repeats in it.
Hint: use substring with for loop

input:
*                                String str="Java is java in everywhere is Java";
*                                String word="Java";
output:3
         */
        String str = "Java is java in everywhere is Java";
        String word= "Java";

        int frequency = 0;
        for (int i = 0; i <= str.length()-4; i++) {
            String a =str.substring(i,i+4);
            if (a.equalsIgnoreCase("Java"))
                frequency++;
        }
        System.out.println(frequency);



    }
}
