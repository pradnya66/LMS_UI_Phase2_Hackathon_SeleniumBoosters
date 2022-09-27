Feature: Delete Multiple Batch

 @Smoke @Sanity
  Scenario: Select multiple Batch
    Given User logged in lms website and navigated to Batch page
    When User selects more than one Batch using checkbox
    Then Batches gets selected

 @Smoke @Sanity
Scenario: Delete  multiple batches 
Given User is on Batch page
When User clicks on Delete button
Then User lands on Confirm Deletion form.

@Sanity
Scenario: Click Yes on Confirm Deletion form
Given user is on Batch Confirm Deletion page
When User clicks Yes button
Then User can see a 'Successful BatchDeleted' message

 @Sanity
Scenario: click no
Given: User is on Batch Confirm Deletion Page after selecting multiple batches
When User clicks No button
Then User can see Batches are still selected and not deleted