package com.company;

public class RegulaTicket extends Ticket{
    private String specialService;
    public RegulaTicket(String departureLoc, String destinationLoc, String departureDateTime, String arrivalDateTime, String seatNumber, float price, boolean cancelled,int duration) {
        super(departureLoc, destinationLoc, departureDateTime, arrivalDateTime, seatNumber, price, cancelled,duration);
        this.specialService=specialService;
    }

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }
    public String getExtraService(){
        return ("Your Special service   : "+this.specialService);
    }
    public void updateSpecialService(String specialService){
        this.specialService=specialService;
    }
    @Override
    public void printTicketDetails(){
        super.getPnrNumber();

    }

}
