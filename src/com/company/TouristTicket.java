package com.company;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private String location[];

    public TouristTicket(String departureLoc, String destinationLoc, String departureDateTime, String arrivalDateTime, String seatNumber, float price, boolean cancelled, int duration) {
        super(departureLoc, destinationLoc, departureDateTime, arrivalDateTime, seatNumber, price, cancelled, duration);
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }
    @Override
    public void printTicketDetails(Ticket ticket) {
        super.getPnrNumber();
    }
}
