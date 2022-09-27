Feature: Results in Ascending order in Batch Page
 @Smoke @Sanity
Scenario: Verify that the results are displayed in Ascending order of Batch name in Batch Page
Given User is logged on to LMS website -BatchPage
  When User is on Manage Batch page -BatchPage
 And User clicks on BatchName sort button -BatchPage
 Then User should see the results in Ascending order of Batch name -BatchPage
  @Smoke @Sanity
 Scenario: Verify that the results are displayed in Ascending order of batch Description
 Given User is on Batch page -BatchPage
 When User clicks on BatchDescription sort button -BatchPage
  Then User should see the results in Ascending order of BatchDescription -BatchPage
   @Smoke @Sanity
 Scenario: Verify that the results are displayed in Ascending order of batch status
 Given User is on Batch page -BatchPage
 When User clicks on Batchstatus sort button -BatchPage
  Then User should see the results in Ascending order of Batch Status -BatchPage
   @Smoke @Sanity
   Scenario: Verify that the results are displayed in Ascending order of NoOfClasses
 Given User is on Batch page -BatchPage
 When User clicks on NumberOfClasses sort button -BatchPage
  Then User should see the results in Ascending order of NumberOfClasses -BatchPage
   @Smoke @Sanity
   Scenario: Verify that the results are displayed in Ascending order of Program Name
 Given User is on Batch page -BatchPage
 When User clicks on Program Name sort button -BatchPage
  Then User should see the results in Ascending order of Program Name -BatchPage