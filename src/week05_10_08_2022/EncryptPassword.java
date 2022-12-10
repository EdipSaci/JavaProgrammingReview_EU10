package week05_10_08_2022;

public class EncryptPassword {
    public static void main(String[] args) {

        /*
        Task 9: Given a string password. Encrypt with "x" a given password and print.

    Hint: do with for loop

     * password: cydeo
     * encrypt with char :x
     * output:cxyxdxexox
         */
        String password= "cydeo";
        char encryptWith = 'x';
        String output = "";

        for (int i = 0; i < password.length() ; i++) {
            output +=""+ password.charAt(i)+encryptWith;
            // 1 iter  cx
            // 2 iter yx
        }
        System.out.println(output);








    }
}
