Feature: AUT  Login

Scenario: Login with valid data
Given Login page is displayed
When User enters login data and click ok button
Then Home page is displayed

@Round2
Scenario: Login with invalid data
Given Login page is displayed
When User invaluid login data and click ok button
Then error mesgae displyed
