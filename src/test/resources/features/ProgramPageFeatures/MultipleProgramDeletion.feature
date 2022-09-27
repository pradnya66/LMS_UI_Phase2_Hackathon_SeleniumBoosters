Feature: Multiple Program Deletion

@Sanity  @Smoke
  Scenario: Select multiple Program
    Given User on Program page
    When User selects more than one Program using checkbox
    Then Programs get selected
@Sanity  @Smoke
  Scenario: Delete Feature
    Given User on Program page
    When User clicks on <Delete> button on top left corner
    Then User lands on Confirm Deletion form.
@Sanity  @Smoke
    Scenario: Click Yes
    Given User is on Confirm Program page Deletion form
    When User clicks <Yes> button
    Then User can see 'Successful Programs Deleted' message
 @Sanity  @Smoke   
     Scenario: Click No
    Given User is on Confirm Program page Deletion form
    When User clicks <No> button
    Then User can see Confirm Deletion form disappears should see "Manage Program" page
    