package week08_10_29_2022;

public class T3CountWord {
    public static void main(String[] args) {

        /*Task 3 : Write a program that accepts String array.Count how many names have the same first and last letter

                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

                Output : 4
         */

        String []str = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};


        int count = 0;
        for (String name : str) {
            String first = name.charAt(0)+ "";
            String last = name.charAt(name.length()-1)+ "";
            if (first.equalsIgnoreCase(last)){
                count++;
            }
        }

        System.out.println(count);


    }
}
