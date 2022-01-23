Feature: Application Login

Scenario: Home page default login
Given User is on landing page
When User login into application with "varun" and "1111"
Then Home page is populated
And Cards are displayed are "true"



Scenario: Home page default login
Given User is on landing page
When User login into application with "Unish" and "0988"
Then Home page is populated
And Cards are displayed are "false"



Scenario: Home page default login
Given User is on landing page
When User signin with following details
| Varun | 1234| varun@cgi.com | India | 5345678 |

Then Home page is populated
And Cards are displayed are "false"



Scenario Outline: Home page default login
Given User is on landing page
When User login in to application with <Username> and <password>
Then Home page is populated
And Cards are displayed are "false"

Examples:
|Username|password|
|User1  | pass1|
|User2   | pass2 |
|User3 | Pass3 |
