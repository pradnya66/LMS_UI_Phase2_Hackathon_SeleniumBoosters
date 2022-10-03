Feature: Add new assignment option of the assignment page
 @Sanity @Smoke
  Scenario: validate add new assignment of the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    And User clicks on A New Assignment button -AssignmentPage
    Then User land on Assignment Details form -AssignmentPage
@Sanity @Smoke
  Scenario: validate new assignment form tile of the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    And User clicks on A New Assignment button -AssignmentPage
    Then User land on form with title "Assignment Details" -AssignmentPage
@Sanity 
  Scenario: Empty assignment form submission of the assignment page
    Given User is on AssignmentDetails Form -AssignmentPage
    When User clicks on save with out any fields -AssignmentPage
    Then User should see message "Name is required." -AssignmentPage
@Sanity 
  Scenario: Enter Assignment Name in form of the assignment page
    Given User is on AssignmentDetails Form -AssignmentPage
    When User Enter Assignment Name "API assignment" -AssignmentPage
    Then User should see the name entered -AssignmentPage
@Sanity 
  Scenario: Enter Assignment description in form of the assignment page
    Given User is on AssignmentDetails Form -AssignmentPage
    When User Enter Assignment Description "Assignment Description" -AssignmentPage
    Then User should see the description entered -AssignmentPage
@Sanity @Smoke
  Scenario: Enter Assignment Grade in form of the assignment page
    Given User is on AssignmentDetails Form -AssignmentPage
    When User Enter Assignment grade "gradeA" -AssignmentPage
    Then User should see the grade entered -AssignmentPage
@Sanity @Smoke
  Scenario: Enter Assignment date in form of the assignment page
    Given User is on AssignmentDetails Form -AssignmentPage
    When User Enter any date available on calender  -AssignmentPage
    Then User should see the date entered -AssignmentPage
@Sanity @Smoke
  Scenario: Validate Save in Assignment form of the assignment page
    Given User is on AssignmentDetails Form -AssignmentPage
    When User enters all details and clicks on Save -AssignmentPage
    Then User should see "Successful Assignment Created" -AssignmentPage
@Sanity @Smoke
  Scenario: Validate cancel in Assignment form of the assignment page
    Given User is on AssignmentDetails Form -AssignmentPage
    When User clicks on Cancel -AssignmentPage
    Then User should see Assignment Details form disappears -AssignmentPage
