Feature: Amazon application search

@amazon
Scenario: Testing the amazon appliaction with search
Given user is landing on application
When user enters the item "iphone" and hits enter
Then user should redirect to Item dispaly page
And user should print the title of current page

