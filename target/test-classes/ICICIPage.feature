@Feature3
Feature: validate the login funcationality in icici page

@Sanity
Scenario: login 
Given TO launch the  chrome browser and maximise the window 
When launching  url
And click login option
And click arrowmark button
And pass the username 
And pass the password
And check whether navigate to the home page or not of facebook
Then close the chrome  browser
