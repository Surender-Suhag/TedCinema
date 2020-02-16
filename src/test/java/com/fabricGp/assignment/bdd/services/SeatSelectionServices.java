package com.fabricGp.assignment.bdd.services;

public interface SeatSelectionServices {

    void selectAvailableSeats(Integer seatCount);

    void validateTotalCheckoutAmount(double v);

    void validateUserPastTicketCountIs(Integer expectedPastTicketCount);
}
