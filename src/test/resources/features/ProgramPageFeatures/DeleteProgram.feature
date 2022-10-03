Feature: Title of your feature
  I want to use this template for my feature file

@Sanity  @Smoke
Scenario: Select Program
    Given User on Program page
    When User selects Program using checkbox
    Then Program gets selected
 @Sanity  @Smoke 
Scenario: Delete Feature
    Given User on Program page
    When User clicks on <Delete> button
    Then User lands on Confirm Deletion form.
@Sanity  @Smoke     
Scenario: Click Yes on Program page Confirm Deletion form
    Given User is on Confirm Program page Deletion form
    When User clicks <Yes> button
    Then User can see 'Successful Program Deleted' message for Program Page
@Sanity  @Smoke    
Scenario: Click No
    Given User is on Confirm Program page Deletion form
    When User clicks <No> button
    Then User can see Confirm Deletion form disappears should see "Manage Program" page
 
