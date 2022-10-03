Feature: Results in Descending order in Batch Page
 @Smoke @Sanity
Scenario: Verify that the results are displayed in Descending order of Batch name in Batch Page
Given User is logged on to LMS website -BatchPage
  When User is on Manage Batch page -BatchPage
 And User double clicks on BatchName sort button -BatchPage
 Then User should see the results in Descending order of Batch name -BatchPage
  @Smoke @Sanity
 Scenario: Verify that the results are displayed in Descending order of batch Description
 Given User is on Batch page -BatchPage
 When User double clicks on BatchDescription sort button -BatchPage
  Then User should see the results in Descending order of BatchDescription -BatchPage
   @Smoke @Sanity
 Scenario: Verify that the results are displayed in Descending order of batch status
 Given User is on Batch page -BatchPage
 When User double clicks on Batchstatus sort button -BatchPage
  Then User should see the results in Descending order of Batch Status -BatchPage
   @Smoke @Sanity
   Scenario: Verify that the results are displayed in Descending order of NoOfClasses
 Given User is on Batch page -BatchPage
 When User double clicks on NumberOfClasses sort button -BatchPage
  Then User should see the results in Descending order of NumberOfClasses -BatchPage
   @Smoke @Sanity
   Scenario: Verify that the results are displayed in Descending order of Program Name
 Given User is on Batch page -BatchPage
 When User double clicks on Program Name sort button -BatchPage
  Then User should see the results in Descending order of Program Name -BatchPage