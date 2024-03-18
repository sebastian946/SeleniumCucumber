

  Feature: Loggein user view

    Scenario: Validate user is able to view login
      Given User navigates to the login page
      When  User succesfully enters the log in details
      Then  User should be able to view the product category page
