Feature: I validate the facebook  login page

  Scenario Outline: I verify the user able to login with correct credetial
    Given user has to be there in login page
    When I verify the user enter the "<username>" and "<password>"
    And I verify the user should click the login button
    Then I verify the user navigating the loginpage

    Examples: 
      | username | password |
      | gg       |     1234 |
      | bb       |    45678 |
      | dd       |     3452 |
