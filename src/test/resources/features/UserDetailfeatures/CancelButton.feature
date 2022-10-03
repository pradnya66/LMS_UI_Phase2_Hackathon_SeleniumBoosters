Feature: Cancel Button
@Sanity @Smoke
Scenario: Verify the presence of Cancel button in user detais window
Given User is on the Manage user page	User details
When User clicks Add new user button on the page
Then User should see a button with text Cancel in user details window


