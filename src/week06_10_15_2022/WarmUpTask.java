package week06_10_15_2022;

public class WarmUpTask {
    public static void main(String[] args) {

        /*
        Given a non-empty string like "Code" print a string like below output.

                                  Code → "CCoCodCode"
                                  abc → "aababc"
                                  ab → "aab"
         */

        String word = "Code";
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            String str = word.substring(0,i);
            System.out.println(str);
            result+=str;
        }
        System.out.println(result+word);



    }
}
