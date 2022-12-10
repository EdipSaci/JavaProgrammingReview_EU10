package week02_09_17_2022;

import java.time.LocalDateTime;

public class BonusForWeek {
    public static void main(String[] args) {

        LocalDateTime today=LocalDateTime.now();
        System.out.println("today=" + today);

        int hour = today.getHour();
        System.out.println("hour = " + hour);
        int minute = today.getMinute();
        int second = today.getSecond();

        System.out.println(hour+ ":"+minute+":"+second );





    }
}


/*
        write a Java program tat prints the current time.
        hour :minute: seconds
        output : 3:55:25

         */
