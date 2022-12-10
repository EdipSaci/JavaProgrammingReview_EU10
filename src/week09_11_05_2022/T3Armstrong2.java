package week09_11_05_2022;

public class T3Armstrong2 {
    public static void main(String[] args) {

        isArmstrongNumber(153);

    }

    public static boolean isArmstrongNumber(int num) {
        boolean isArmstrong = true;
        int firstDigit = num / 100;
        int secondDigit = (num % 100) / 10;
        int thirdDigit = (num % 100) % 10;

        double total1 = (firstDigit * firstDigit * firstDigit) + (secondDigit * secondDigit * secondDigit) + (thirdDigit * thirdDigit * thirdDigit);
        int total = (int) total1;

        if (num < 100 || num > 999) {
            System.err.println("Invalid number");
        } else {
            if (total == num) {
                System.out.println(isArmstrong);
            } else {
                System.out.println(false);
            }
        }

        return isArmstrong;

    }
}