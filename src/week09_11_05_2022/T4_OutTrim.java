package week09_11_05_2022;

public class T4_OutTrim {
    public static void main(String[] args) {
        String result =outTrim(" Hello  ");
        System.out.println(result);

    }
    public static String outTrim(String str){
        String result ="";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)==' ')
               continue;
            result+=str.charAt(i);
        }
        return result;
    }
}
/*Task 4 :    Write a method that can remove  all extra space from String , trim() is forbidden

// create a loop --- taking every index one by one with charAt(i)  and compares against ' '   str.charAt(i) == ' '
don't add empty to result, if not empty add it to result string

                 Input: "  Hello "
                 Output: Hello
*/
