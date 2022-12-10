package week07_10_22_2022;

public class taskAdamComeHere {
    public static void main(String[] args) {
        /*
        Task 4: Reverse each word in a sentence.
    input:
    String str = "Adam come here";
    output:
    madA emoc ereh
         */
        String str = "Adam come here";
        String result="";

        for (int i = 0; i <str.length() ; i++) {

            if(i==str.length()-1){
                for (int j = i; j >= 0; j--) {
                    result+=str.charAt(j);
                }
                System.out.println(result);
                System.exit(0);
            }
            if(str.charAt(i)==' '){

                for (int j = i-1; j >=0 ; j--) {

                    result+= str.charAt(j);
                }
                result+=" ";
                str=str.substring(i+1);
                i=0;
            }
        }





    }
}

