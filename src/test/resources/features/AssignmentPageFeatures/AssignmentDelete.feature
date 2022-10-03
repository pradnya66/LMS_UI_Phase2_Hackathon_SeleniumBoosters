Feature: Delete option of the assignment page
 @Sanity
  Scenario: Validate the delete confirmation of the assignment page
    Given User is logged on to LMS website -AssignmentPage
    When User is on Manage Assignment page -AssignmentPage
    And User clicks on Delete button -AssignmentPage
    Then User should see the Confirm Deletion form -AssignmentPage
 @Sanity
  Scenario: Validate deletion by clicking Yes -Assignment page
    Given User is on Confirm Deletion form -AssignmentPage
    When User clicks on Yes -AssignmentPage
    Then User should see "Successful Assignment Deleted" message -AssignmentPage
@Smoke @Sanity
  Scenario: Validate deletion by clicking No -Assignment page
    Given User is on Confirm Deletion form -AssignmentPage
    When User clicks on No -AssignmentPage
    Then User can see Confirm Deletion form disappears -AssignmentPage
