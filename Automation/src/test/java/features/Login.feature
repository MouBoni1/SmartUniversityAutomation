Feature: User Login

  Scenario: Successful Login
    Given the user is on the login page
    When the user enters valid credentials (username: "admin", password: "admin#123")
    When the user enters correct captcha
    And the user clicks on the Login button
    Then the user is prompted an alert
    And the user should see the dashboard
