Feature: New User Registration View
  Scenario: Validate new user is able to view after clicking registration
    Given User navigate to the login page
    When User clicks on new Registration button
    Then User should be able to view the registration page