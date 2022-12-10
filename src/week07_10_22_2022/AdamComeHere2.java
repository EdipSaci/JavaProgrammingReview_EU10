package week07_10_22_2022;

public class AdamComeHere2 {
    public static void main(String[] args) {
        String str = "Adam come here";
        String result = "";

        if(str.charAt(str.length()-1)!=' '){

            str+=" ";
        }

        while(str.contains(" ")) {

            for (int i = str.indexOf(' '); i >= 0 ; i--) {
                result+=str.charAt(i);
            }
            str=str.substring(str.indexOf(' ')+1);
        }
        System.out.println(result.trim());
    }
}
