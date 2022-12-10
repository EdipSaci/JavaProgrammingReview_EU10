package week07_10_22_2022;

public class T2ChangingWord {
    public static void main(String[] args) {
        /*
         Task 2:  Write a program that replaces every occurrence of "cat" in the message with "dog", using indexOf and substring.

  input:
  String message = "I love cats! I have a cat named Coco. My cat's very smart!";
  output:
 "I love dogs! I have a dog named Coco. My dog's very smart!";
         */
        String message = "I love cats! I have a cat named Coco. My cat's very smart!";

        String searched = "cat";
        String changed = "dog";
        String result ="";

        int indexOfFirstCat = message.indexOf(searched);
        int endOfWord= indexOfFirstCat+searched.length();
       message= message.substring(0,indexOfFirstCat) + changed+ message.substring(endOfWord);
        System.out.println(message);// this action only changed a "cat"

        //we need to check the message contains cat or not

        while (message.contains(searched)){
             indexOfFirstCat = message.indexOf(searched);
             endOfWord= indexOfFirstCat+searched.length();
            message= message.substring(0,indexOfFirstCat) + changed+ message.substring(endOfWord);
        }

        System.out.println(message);






        /*
        this is Edip's solution
         for (int i = 0; i < message.length()-3; i++) {
           String eachCat = message.substring(i,i+3);
           if (eachCat.equals("cat")){
               message=message.replaceAll("cat", "dog");
           }
        }
        System.out.println(message);
         */


    }
}
