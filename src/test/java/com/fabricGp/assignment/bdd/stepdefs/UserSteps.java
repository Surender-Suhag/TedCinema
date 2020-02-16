package com.fabricGp.assignment.bdd.stepdefs;


import com.fabricGp.assignment.bdd.data.User;
import com.fabricGp.assignment.bdd.services.SeatSelectionServices;
import io.cucumber.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

public class UserSteps implements En {

    @Autowired
    public UserSteps(User user, SeatSelectionServices seatSelectionServices){
       And("past booked ticket count  is {int}",(Integer pastTicketCount)->{
           user.setPastMovieCount(pastTicketCount);
       });

       And("Ticket accumulation count should be {int}",(Integer ticketCount)->{
           seatSelectionServices.validateUserPastTicketCountIs(ticketCount);
       });
    }
}
