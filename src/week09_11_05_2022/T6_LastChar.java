package week09_11_05_2022;

public class T6_LastChar {
    public static void main(String[] args) {
       String result2 =lastChar("ab");
        System.out.println(result2);
    }
    public static String lastChar (String str){
        String result = "";
        if (str.length()==1){
            result= str+"";
        } else if (str.length()==2) {
            result= ""+str.charAt(1)+ "" + str.charAt(0) +"";
        } else if (str.length()>3) {
            result= str.charAt(str.length()-1)+ str.substring(1,str.length()-1)+ str.charAt(0);
        }
        return result;
    }
}

/*
Task 6 : Write a method that return a new string where the first and last chars have been exchanged.
             frontBack("code") → "eodc"
             frontBack("a") → "a"
             frontBack("ab") → "ba"

 */