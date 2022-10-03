Feature: Edit batch details

 @Smoke @Sanity
  Scenario: Edit Feature in Batch Page
    Given User on BatchPage
    When User clicks on batch Edit button 
    Then User lands on Batch Details form.
    
   @Smoke @Sanity
   Scenario: Edit Batch Name in Batch Details page
    Given User is on Batch details page
    When User edits Name batch name "NNBatch12"
    Then User can see edited Name "NNBatch12"
    
 @Smoke @Sanity
     Scenario:  Edit Batch Description
    Given User is on Batch details page
    When User edits batch Description "SDEt Batch new batch"
    Then User can see edited description "SDEt Batch new batch"
 @Smoke @Sanity
    Scenario: Edit program name in batch details page
      Given User is on Batch details page
       When user selects program name from drop down
       Then user can see selected program name
 @Smoke @Sanity
    Scenario: change batch status
    Given User is on Batch details page
    When user changes batch status to "Active"
    Then User can see updated batch status "Active"
 @Smoke @Sanity
    Scenario: Edit No of classes
    Given User is on Batch details page
    When user enters No Of Classes "15"
    Then user can see updated No of classes "15"
    
 @Smoke @Sanity
    Scenario: Click Cancel
    Given: User is on Batch details page
    When: user clicks cancel button
    Then: User can see Batch Details are not updated 
     @Smoke @Sanity
    Scenario: click save -BatchDetailsPage
    Given User is on Batch Details Page
    When user clicks save button
    Then User can see 'Successful Batch Updated' alert
    
     @Smoke @Sanity
    Scenario: Verify Edited Batch details record
    Given User is on Batch page
    When User searches with newly updated "NNBatch12"
    Then User verifies that the details are correctly updated.
    
    
    
    
    
    
    
    
    
    







