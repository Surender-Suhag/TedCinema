Feature: Ted card users are given special discounts on ticket bookings

      #Assuming ticket price is x.

  Scenario Outline: Active Ted card user books ticket
    Given Ted user is logged in
    And  past booked ticket count  is <PastAccumulatedTickets>
    When I book a show with show date a <weekday>
    And  I book <NoOfTickets> tickets
    Then the total amount should be <Price>
    And Ticket accumulation count should be <NewAccumulatedTickets>

    @ui @regression
    Examples: Non-Tuesday
    |PastAccumulatedTickets | weekday       | NoOfTickets| Price|NewAccumulatedTickets|
    |0                      | non-tuesday | 1          | .9x  |1                    |
    |4                      | non-tuesday | 1          | 0    |0                    |
    |3                      | non-tuesday | 2          | .9x  |0                    |
    |0                      | non-tuesday | 5          | 3.6x |0                    |
    # With 7 new tickets, two are free and rest 5 will have 10% off .i.e. cost = (.9*5)x
    |4                      | non-tuesday | 7          | 4.5x |1                    |

    @ui @smoke @regression
    #Assuming only 50% discount on Super Tuesday and 10% is no longer valid for Ted card users
    Examples: Tuesday
      |PastAccumulatedTickets | weekday     | NoOfTickets| Price|NewAccumulatedTickets|
      |0                      | tuesday     | 1          | .5x  |1                    |
      |4                      | tuesday     | 1          | 0    |0                    |
      |3                      | tuesday     | 7          | 2.5x |0                    |

