Feature: After successful payment, user should be able to print tickets
  Details are also sent to the registered mobile number.

  Scenario: Booking confirmed sms
    Given I have selected a show
      | show | date        |
      | 1917 | 18 Feb 2020 |

    And I have selected a seat
    When I make successful payment
    Then I should receive a message
    """
    Your booking is successful.
    Seat - Row 2B
    Date - 18 Feb 2020 at 11:00 AM
    Show - 1917
    Screen - 1
    """
    