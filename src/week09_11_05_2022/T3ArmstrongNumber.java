package week09_11_05_2022;

public class T3ArmstrongNumber {

    public static void main(String[] args) {

        boolean result =armstrong(370);
        System.out.println(result);
    }

    public static boolean armstrong (int number){
        int firstDigit =0;
        int secDigit =0;
        int thirdDigit =0;
        if (number<100 || number>999)
            return false;

        String num = number+"";
        char [] numArray = num.toCharArray();

        firstDigit= numArray[0]- 48;
        secDigit= numArray[1]-48;
        thirdDigit=numArray[2] -48;

        if (((firstDigit*firstDigit*firstDigit)+(secDigit*secDigit*secDigit)+ (thirdDigit*thirdDigit*thirdDigit))==number )
            return true;
        else return false;

    }



}

/*
Task 3 :   Write a method that can check if a number is Armstrong number
                Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.

                Armstrong numbers are     === 153 370 371 407 === for 3 digits
 */
