Feature: Add New User button
@Sanity @Smoke
Scenario: Verify the presence of Add new user button	
Given User is on Manage user page
When User clicks Add New User button	
Then User should see the User details dialog box