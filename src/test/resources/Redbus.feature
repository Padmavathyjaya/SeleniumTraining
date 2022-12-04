@Feature4
Feature: sigin to redbus app

@Sanity
Scenario: login 
Given TO launch the  chrome browser and maximise the window 
When launching  url
And click login option
And click signin 
And pass the phonenumber 
And check whether navigate to the home page or not of facebook
Then close the chrome  browser

