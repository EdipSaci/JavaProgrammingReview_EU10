package week13_12_03_2022.flightTicket;

public class FlightTicket {

    private String type;
    private String location;
    private String arrival;

    public FlightTicket(String type, String location, String arrival) {
        setType(type);
        setLocation(location);
        setArrival(arrival);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!(type.equalsIgnoreCase("first") || type.equalsIgnoreCase("business")|| type.equalsIgnoreCase("economy"))){
            System.exit(0);
        }
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String toString() {
        return "FlightTicket{" +
                "type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}
/*
FlightTicket Task

 declare these instance variables in FlightTicket class:
            type  (first, business, economy)
            departure location/airport
            arrival location/airport

         encapsulate all of them

         create constructor to set up the object

            Note: type should only be first, business, or economy

_______________________________________

 */