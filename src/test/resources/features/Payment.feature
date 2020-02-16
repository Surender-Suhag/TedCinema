Feature: Payment for the tickets online by credit card

  Scenario Outline: Making payment online using credit/debit card.
    Given User have selected a seat in row 1 and column 2 for a show
    And i click on "make payment"
    When i enter <cardNumber> in card number
    And i enter <cvcNumber> in cvc number
    And i make payment
    Then "message" should be displayed
    And seat in row 1 and column 2 should be <seatStatus>

    Examples: Valid cards and valid cvc numbers. Seat is booked
      | cardNumber       | cvcNumber | message                 | seatStatus |

      #For Visa credit card
      | 4242424242424242 | 983       | "Payment is successful" | booked     |
      #For Visa Debit card
      | 4000056655665556 | 983       | "Payment is successful" | booked     |
      #For mastercard credit card
      | 5555555555554444 | 983       | "Payment is successful" | booked     |
      #For mastercard debit card
      | 5200828282828210 | 983       | "Payment is successful" | booked     |
      #For american express credit card
      | 378282246310005  | 983       | "Payment is successful" | booked     |

    Examples: Invalid card Numbers. Seat is not booked

      | cardNumber  | cvcNumber | message                                  | seatStatus |
      #For Visa credit card
      | 1231211     | 893       | "Invalid card details. Please try again" | available  |
      #For mastercard credit card
      | 40000123411 | 893       | "Invalid card details. Please try again" | available  |

    Examples: Invalid CVC. Seat is not booked
      | cardNumber       | cvcNumber | message                            | seatStatus |
      #For Visa credit card
      | 4242424242424242 | 123       | "Payment Failed. Please try again" | available  |
      #For Visa Debit card
      | 4000056655665556 | 123       | "Payment Failed. Please try again" | available  |
       #For mastercard credit card
      | 5555555555554444 | 123       | "Payment Failed. Please try again" | available  |
      #For mastercard debit card
      | 5200828282828210 | 123       | "Payment Failed. Please try again" | available  |
      #For american express credit card
      | 378282246310005  | 123       | "Payment Failed. Please try again" | available  |

    Examples: Expired Credit cards. Seat is not booked
      | cardNumber       | cvcNumber | message                            | seatStatus |
      | 4000000000000068 | 123       | "Payment Failed. Please try again" | available  |
      | 4000000000000069 | 123       | "Payment Failed. Please try again" | available  |


  Scenario: Credit cards details should not be saved
    Given User have selected a seat a show
    And i click on "make payment"
    When i enter 4242424242424242 in credit number
    And i enter 983 in cvc number
    And i make payment
    And i check cookies
    Then credit card details should not get saved in cookies