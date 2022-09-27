Feature: Results in Ascending order in the Program page
@Sanity  @Smoke
  Scenario: Validate the results ascending order of Program Name in the Program page
    Given User is logged on to LMS website -ProgramPage
    When User is on Manage Program page -ProgramPage
    And User clicks on ProgramName sort button -ProgramPage
    Then User should see the results in Ascending order of Program name -ProgramPage
@Sanity  @Smoke
  Scenario: Validate the results ascending order of Program Description in the Program page
    Given User is logged on to LMS website -ProgramPage
    When User is on Manage Program page -ProgramPage
    And User clicks on ProgramDescription sort button -ProgramPage
    Then User should see the results in Ascending order of Program description -ProgramPage
@Sanity  @Smoke  
   Scenario: Validate the results ascending order of Program Status in the Program page
    Given User is logged on to LMS website -ProgramPage
    When User is on Manage Program page -ProgramPage
    And User clicks on ProgramStatus sort button -ProgramPage
    Then User should see the results in Ascending order of Program Status -ProgramPage