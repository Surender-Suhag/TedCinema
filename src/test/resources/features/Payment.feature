Feature: Payment for the tickets online by credit card
        Only Visa, mastercard and american express credit cards are supported

  Scenario Outline: Making payment online using credit/debit card
    Given User has booked a seat
    And i am checkout
    When I use <cardType>
    And i enter <cardNumber>
    And i enter <cvcNumber>
    Then "message" should be displayed

    Examples: Valid cards and valid cvc numbers
    |cardType         |cardNumber      |cvcNumber|message|
    |Visa             |4242424242424242|983      |"Payment is successful"|
    |Visa Debit       |4000056655665556|983      |"Payment is successful"|
    |Mastercard       |5555555555554444|983      |"Payment is successful"|
    |Mastercard Debit |5200828282828210|983      |"Payment is successful"|
    |Americal Exp     |378282246310005|983       |"Payment is successful"|

    Examples: Invalid card Numbers

    |cardType         |cardNumber      |cvcNumber|message|
    |Visa             | 1231211        |893      |"Invalid card details. Please try again"|
    |Master           | 40000123411    |893      |"Invalid card details. Please try again"|

    Examples: Invalid CVC
      |cardType         |cardNumber      |cvcNumber|message|
      |Visa             |4242424242424242|123      |"Payment Failed. Please try again"|
      |Visa Debit       |4000056655665556|123      |"Payment Failed. Please try again"|
      |Mastercard       |5555555555554444|123      |"Payment Failed. Please try again"|
      |Mastercard Debit |5200828282828210|123      |"Payment Failed. Please try again"|
      |Americal Exp     |378282246310005|123       |"Payment Failed. Please try again"|

    Examples: Expired Credit cards
      |Visa             |4000000000000068|123      |"Payment Failed. Please try again"|
      |Visa Debit       |4000000000000069|123      |"Payment Failed. Please try again"|
