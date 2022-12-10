package week10_11_12_2022;

import java.util.Arrays;

public class T4Solution2 {
    public static void main(String[] args) {
        String [] arr = {"one", "hi", "hold"};

        String [] result = hidePassword(arr);
        System.out.println(Arrays.toString(result));


    }

    public static String[] hidePassword(String[] arr) {

        String [] results = new String[arr.length];
        int index= 0;
        //I need to get each element
        for (String element : arr) {
            //convert letters to starts
        String result=  convertLettersToStar(element);
        results[index++]=result;

        }
        return results;

    }
    // this method will get string it will convert into the stars
    public static String convertLettersToStar(String eachWord) {
        String temp="";
        for (int i = 0; i < eachWord.length(); i++) {
            temp+="*";
        }
        return temp;
    }


}
