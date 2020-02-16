package com.fabricGp.assignment.bdd.stepdefs;

import com.fabricGp.assignment.bdd.data.Seats;
import com.fabricGp.assignment.bdd.services.SeatSelectionServices;
import io.cucumber.java8.En;
import org.springframework.beans.factory.annotation.Autowired;

public class SeatsSelectionSteps implements En {
        @Autowired
    public SeatsSelectionSteps(SeatSelectionServices seatSelectionServices){
            And("I book {int} tickets",(Integer seatCount)->{
                seatSelectionServices.selectAvailableSeats(seatCount);
            });
            Then("the total amount should be {double}(x)",(Double pricePercentagePerTicket)->{
                seatSelectionServices.validateTotalCheckoutAmount(pricePercentagePerTicket* Seats.getPricePerSeat());
            });
        }
}
