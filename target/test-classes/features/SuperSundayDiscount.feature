Feature: Super Tuesdays: On tuesday, the cinema tickets will be at ½ the original price.

  #Assuming x is the price of a ticket without any discount

  Scenario Outline: Regular Logged in user booking tickets
    Given valid user is logged in
    And I book a show with show date a <weekday>
    When I book <NoOfTickets> tickets
    Then the total amount should be <Price>

    Examples:
    |Weekday    | NoOfTickets |Price|
    |Tuesday    |1            |.5x  |
    |non-tuesday|1            | 1x   |
    |Tuesday    |5            |2.5x  |
    |non-Tuesday|5            |5x  |




  Scenario Outline: Booking tickets Without Login
    Given user chooses to book tickets without login
    And I book a show with show date a <weekday>
    When I book <NoOfTickets> tickets
    Then the total amount should be <Price>

    Examples:
      |Weekday    |NoOfTickets|Price|
      |Tuesday    |1          |.5x  |
      |non-tuesday|1          |1x   |
      |Tuesday    |5            |2.5x  |
      |non-Tuesday|5            |5x  |