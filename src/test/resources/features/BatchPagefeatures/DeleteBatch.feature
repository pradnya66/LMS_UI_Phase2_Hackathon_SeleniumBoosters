Feature: Delete Batch

 @Smoke @Sanity
Scenario: delete feature batch
Given user is on Batch page
When user clicks delete  button for any batch
Then user will get confirm deletion popup

 @Smoke @Sanity
Scenario: Click Yes delete batch
Given user is on Batch Confirm Deletion page
When User clicks Yes button in Confirm Deletion Page
Then User could see 'Successful BatchDeleted' message

 @Smoke @Sanity

Scenario: Verify deleted batch
Given user is on Batch page
When User Searches for "Deleted Batch name"
Then There should be zero results.
