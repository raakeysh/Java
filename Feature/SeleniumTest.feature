
Feature: SeleniumTest
Scenario: Successful Login with Valid Credentials
Given User is on Home Page
When User Navigate to LogIn Page
And User enters credentials to login
|username|password|
|testuser_1|Test@153|
|testuser_2|Test@153|
|testuser_3|Test@153|
|testuser_4|Test@153|
Then Message displayed Login Successfully