package com.fabricGp.assignment.bdd.ui.pages;

import org.springframework.stereotype.Component;

@Component
public class SeatsSelectionPage extends BasePage{

    private int bookedTickets = 0;

    public void selectFirstAvailableSeat(){
        bookedTickets+=1;
        System.out.println("Selecting seat. Total booked seat count is " + bookedTickets);
    }

    public int getBookedTicketsCount(){
        return this.bookedTickets;
    }


    public void selectAParticularSeat(int rowNo,int colmnNo){
        bookedTickets+=1;
        System.out.format("selected seat in %d row and %d column \n",rowNo,colmnNo);
    }



}
