package week13_12_03_2022.flightTicket;

import java.util.ArrayList;
import java.util.Arrays;

public class Airport {

    static ArrayList<FlightTicket> tickets= new ArrayList<>();

    static  {
        FlightTicket flightTicket1=new FlightTicket("first", "Washington", "Virgina");
        FlightTicket flightTicket2=new FlightTicket("business", "New York", "Texas");
        FlightTicket flightTicket3=new FlightTicket("economy", "Chicago", "Vegas");
        FlightTicket flightTicket4=new FlightTicket("first", "Chicago", "San Francisco");
        FlightTicket flightTicket5=new FlightTicket("business", "Virgina", "Washington");
        FlightTicket flightTicket6=new FlightTicket("economy", "Chicago", "New York");
        FlightTicket flightTicket7=new FlightTicket("first", "Chicago", "Boston");
        FlightTicket flightTicket8=new FlightTicket("business", "San Francisco", "Texas");
        FlightTicket flightTicket9=new FlightTicket("economy", "Chicago", "Washington");
        FlightTicket flightTicket10=new FlightTicket("economy", "Vegas", "Virgina");

        tickets.addAll(Arrays.asList(flightTicket1,flightTicket2,flightTicket3,flightTicket4,flightTicket5,flightTicket6,flightTicket7,flightTicket8,flightTicket9,flightTicket10));
    }


    public  static  ArrayList<FlightTicket> first(String type){
        tickets.removeIf(p-> (!p.getType().equals(type)));
        return tickets;
    }
    public static ArrayList<FlightTicket> fromChicago(String departure){
        tickets.removeIf(p-> p.getLocation().equals(departure));
        return tickets;
    }

}
/*
Then create 10 objects in Airport class in static block

Examples :

  FlightTicket ticket1 = new FlightTicket("first", "Chicago", "Virgina");
  FlightTicket ticket1 = new FlightTicket("business", "Chicago", "Virgina");
  .
  .
  .
Tasks:

1- create a method returns list of flight tickets are first as type (try to make it dynamic)
2- create a method returns list of flight tickets are from Chicago   (try to make it dynamic)

 */