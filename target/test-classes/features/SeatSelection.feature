Feature: Seat selection scenarios
  Scenario: Making payment after 10 minutes of seat selection
    Given user has selected a seat
    When  I wait for 10 minutes
    And i click on checkout
    Then "Timeout. No action in last 10 mins" error message should be displayed

    Scenario: Same seats booked by two users at same time
      Given user 'A' has selected a seat in row 2 and column 3
      And user 'B' has selected a seat in row 2 and column 3
      When user 'A' checks out
      And user 'B' checks out
      Then "Seat already taken" error message should be displayed for user 'B'
      And seat should be booked for user 'A'
      And seat in row 2 and column 3 should be booked