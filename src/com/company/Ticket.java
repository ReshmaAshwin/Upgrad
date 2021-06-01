package com.company;

public class Ticket {
    private static int pnrNumber = 1;
    private String departureLoc;
    private String destinationLoc;
    private String departureDateTime;
    private String arrivalDateTime;
    private Flight flight;
    private Passenger passenger;
    private String seatNumber;
    private float price;
    private boolean cancelled;
    private int duration;

    public Ticket(String departureLoc, String destinationLoc, String departureDateTime, String arrivalDateTime,  String seatNumber, float price, boolean cancelled,int duration) {
        this.departureLoc = departureLoc;
        this.destinationLoc = destinationLoc;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNumber = seatNumber;
        this.price = price;
        this.cancelled = cancelled;
        this.flight = flight;
        this.passenger = passenger;
    }

    public Ticket(Flight flight) {
        this.flight=flight;
    }

    public static int getPnrNumber() {
        return pnrNumber;
    }

    public static void setPnrNumber(int pnrNumber) {
        Ticket.pnrNumber = pnrNumber;
    }

    public String getDepartureLoc() {
        return departureLoc;
    }

    public void setDepartureLoc(String departureLoc) {
        this.departureLoc = departureLoc;
    }

    public String getDestinationLoc() {
        return destinationLoc;
    }

    public void setDestinationLoc(String destinationLoc) {
        this.destinationLoc = destinationLoc;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String checkStatus() {
        int var10000 = pnrNumber++;
        return "PNR Number    : " + var10000 + "  Departure     : " + this.departureLoc + "  Destination   : " + this.destinationLoc + " DepartureDate&Time  :" + this.arrivalDateTime + " Seat Number   : " + this.seatNumber + " price   : " + this.price;
    }

    public int getFlightDuration() {
        return this.duration;
    }

    public void cancel() {
        if (this.cancelled==true) {
            System.out.println("Ticket cancelled");


        } else {
            System.out.println("Ticket not cancelled");
        }

    }
    public void ticketDetails(){
        Ticket.pnrNumber++;
    }
}

