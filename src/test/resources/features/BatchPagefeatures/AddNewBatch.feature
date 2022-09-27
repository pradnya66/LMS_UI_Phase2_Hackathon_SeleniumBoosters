Feature: Add Batch
 @Smoke @Sanity
Scenario: validate add new batch
Given User on Batch page
When User clicks <A New Batch> button
Then user can see Batch details form

 @Smoke @Sanity
Scenario: Empty form submission
Given User is on Batch details page
When User clicks <Save> button with empty fields
Then User gets message 'Name is required'

 @Smoke @Sanity
Scenario: Click Cancel
Given User is on Batch details page
When User clicks Cancel button
Then User can see Batch Details form disappears

  
 @Smoke @Sanity
 Scenario:  Enter Batch Name
    Given User is on Batch details page
    When User enters Batch Name "Python" in text box
    Then User can see Name "Python" entered
  
@smoke @Sanity  
 Scenario:  Enter Batch Description
    Given User is on Batch details page
    When User enters Description "Python Batch"  description text box
    Then User can see description Name "Python Batch" entered
  
 @Smoke @Sanity    
 Scenario: Enter Program name
 Given User is on Batch details page
 When User selects Program name
 Then User can see 'Program Name' selected 
 
 @Smoke @Sanity  
 Scenario: Select Status
 Given User is on Batch details page
 When User selects Status Active <Status> using radiobutton
 Then User can see 'Active' status selected
 
 @Smoke @Sanity 
 Scenario: Enter No of classes
 Given User is on Batch details page
 When User enters No of classes '12' in text box
 Then User can see No of classes '12' entered
 
@smoke @Sanity  
 Scenario: Click Save
 Given User is on Batch details page
 When User clicks Save button
 Then User gets Successful batch created message
 
 @Smoke @Sanity
 Scenario: Verify Added Batch is created
 Given User is on Batch page
 When User searches with newly created batch "Python"
 Then records of the newly created batchname  "Python" is displayed
 
 
 
 
 
 
 
 
 
 
 
 
 
    
