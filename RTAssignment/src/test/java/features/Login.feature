Feature: Application Login

Background:
Given Validate the browser
When Browser is opened
Then validate the display


#@practicetest
#Scenario: Amazon page should open
#Given User is landing to amazon page
#When User entered iphone in search box
#Then User able to see the iphone display page
#And user hitted the search button
#
#
#
#@Webtest
#Scenario: Home page default login
#Given User is on landing page
#When User login into application with "varun" and "1111"
#Then Home page is populated
#And Cards are displayed are "true"
#
#
#@Regtest
#Scenario: Home page default login
#Given User is on landing page
#When User login into application with "Arun" and "0988"
#Then Home page is populated
#And Cards are displayed are "false"
#
#
#@Mobiletest
#Scenario: Home page default login
#Given User is on landing page
#When User signin with following details
#| Varun | 1234| varun@cgi.com | India | 5345678 |
#Then Home page is populated
#And Cards are displayed are "false"
#
#
#@smoketest
#Scenario Outline: Home page default login
#Given User is on landing page
#When User login in to application with <Username> and <password>
#Then Home page is populated
#And Cards are displayed are "false"
#
#Examples:
#|Username|password|
#|User1  | pass1|
#|User2   | pass2 |
#|User3 | Pass3 |
