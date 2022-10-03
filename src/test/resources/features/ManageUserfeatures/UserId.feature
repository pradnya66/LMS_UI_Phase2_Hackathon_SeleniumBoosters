Feature: User ID
@Sanity @Smoke
Scenario: Verify ID functionality	
Given User table is displayed in manage user page
When User clicks ID in any row	
Then User details dialog box displayed with user information
