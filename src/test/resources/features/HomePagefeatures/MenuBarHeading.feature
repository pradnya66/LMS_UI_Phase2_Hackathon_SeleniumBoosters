Feature: Menu bar Heading feature

@Sanity @Smoke  
  Scenario: Verifying the heading on the Home page 
    Given User is on the browser
    When User landed on the Home page after logging into the LMS website
    Then User should see a heading with text "LMS - Learning Management System" on the Home page
   

 