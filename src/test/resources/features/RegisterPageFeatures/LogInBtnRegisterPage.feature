@tag
Feature:Login Button


  @tag1
  Scenario: Validating the Login button visibility
    Given User is on LMS website
    When User lands on Registration page
    Then User sees a button with text "Log in" on the form

 @tag1
  Scenario: Validating the Login button functionality
    Given User is on the Registeration Page
    When User selects the Log in button
    Then User lands on Log in page "Please login to LMS application"
