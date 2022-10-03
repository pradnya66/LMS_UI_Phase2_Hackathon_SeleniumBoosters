Feature: Pagination of Batch Page

 @Smoke @Sanity
Scenario: Verify previous link on the first page
Given User is logged on to LMS website -BatchPage
When User is on first page of Manage Batch - BatchPage
Then Verify that previous link is disabled

 @Smoke @Sanity
Scenario: Verify next link on the manage batch page
Given User is on page number '1'
When User clicks next navigate > button
Then User navigated to page number '2'
 @Smoke @Sanity
Scenario: Verify previous link
Given User is on page number '2'
When User clicks previous navigate < button
Then User navigated to first page of manage batch

 @Smoke @Sanity
Scenario: verify next link on the last page of batch page
Given User is logged on to lms Batch Page 
When User is on last page of Manage Batch
Then Verify that next link is disabled

