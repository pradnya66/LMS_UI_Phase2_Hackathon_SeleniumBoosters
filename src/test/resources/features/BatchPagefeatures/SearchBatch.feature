Feature: Search option of the Batch page
 @Smoke @Sanity
Scenario: Validate the text in searchbox of the batch page
    Given User is on BatchPage
    When user clicks on search box with "Batch Name" entered in it
    Then records of that  "Batch Name" are displayed
    
 
    
    