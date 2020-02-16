package com.fabricGp.assignment.bdd.helper;

import com.fabricGp.assignment.bdd.services.SeatSelectionServices;

public class DefaultSeatSelection implements SeatSelectionServices {
    @Override
    public void selectAvailableSeats(Integer seatsCount) {
        System.out.format("Selecting total of %d seats\n",seatsCount);

    }


    @Override
    public void validateTotalCheckoutAmount(double expectedAmount){
        System.out.format("validating total checkout amount. Expected is %.2f \n",expectedAmount);
    }


    @Override
    public void validateUserPastTicketCountIs(Integer expectedPastTicketCount){
        System.out.format("Validating user past ticket count. Expected is %d\n",expectedPastTicketCount);
    }
}
