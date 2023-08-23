Feature: Login User


  @smoke
  Scenario: User is able to login sucessfully with valid crendential
    Given user enters valid username in the username field
    And User enters valid password in the password field
    When User click on login button
    Then User is logged in successfully
  @smoke @regression
  Scenario Outline: User is not able to login with invalid crendential
    Given user enters <email> in the username field
    And User enters <password> in the password field
    When User click on login button
    Then error <message> should be displayed
    Examples:
    |email|password|message|
    |abc@gmail.com|Tester@23456|Warning: No match for E-Mail Address and/or Password.|
    |xyz@gmail.com|Tester@23456|Warning: No match for E-Mail Address and/or Password.|

  @datadriven
  Scenario Outline: This is a scenario to test datadriven test on Cucumber JVM.
    Then UserName and Password shows on console form given <RowsNumber>
    Examples:
      | RowsNumber |
      |          1             |
      |          2             |


