Feature: Edit Program Details
@Sanity  @Smoke
  Scenario: Select Program
    Given User on Program page
    When User selects Program using checkbox
    Then Program gets selected
  @Sanity  @Smoke  
 Scenario: Edit Feature
    Given User on Program page
    When User clicks on Edit button
    Then User lands on Program Details form "Program Details"
  @Sanity  @Smoke  
 Scenario:  Edit Program Name
    Given User is on Program Details form
    When User edits Name "Java Basics"
    And selects the Save button
    Then User can see updated Name "Java Basics" 
   @Sanity  @Smoke
 Scenario:  Edit Program Description
    Given User is on Program Details form
    When User edits Description "Java Fundamentals"
    And selects the Save button
    Then User can see updated Description "Java Fundamentals"
 
  @Sanity  @Smoke
  Scenario:  Change Program Status
    Given User is on Program Details form
    When User changes status 
    And selects the Save button
    Then User can see updated Status "Inactive"
   @Sanity  @Smoke 
   Scenario:  Click Cancel
    Given User is on Program Details form
    When User clicks Cancel button
    Then User can see Program Details form disappears "Manage Program"
  @Sanity  @Smoke   
  Scenario:  Click Save
    Given User is on Program Details form
    When User clicks Save button with name "Java1"
    Then User can see 'Successful Program Updated' message
 
 
 
    

     
    
    
    
 
    
    
    

