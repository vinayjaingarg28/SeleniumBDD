Feature: Login Test

  Scenario: User is able to login with valid credentials

    Given Navigate to login page
    When Enter the username and password
    And Click on submit button
    Then Verify the successful login