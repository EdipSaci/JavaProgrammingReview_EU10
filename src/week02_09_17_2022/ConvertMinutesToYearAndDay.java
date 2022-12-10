package week02_09_17_2022;

public class ConvertMinutesToYearAndDay {
    public static void main(String[] args) {
         int     min = 3456789,
                 year= min/(24*365*60),
                 remindermin =min%(24*365*60),
                 reminderDays =remindermin/ (24*60);

        System.out.println(min+ " minutes is approximately " + year + " years and "+ reminderDays +" days");
        System.out.println("reminderDays = " + reminderDays);
    }
}
/* class named ConvertMiutesToYearAndDay, write a Java program to convert minutes into a number of years and days.

        Input the number of minutes: 3456789
        Expected Output :
        3456789 minutes is approximately 6 years and 210 days */