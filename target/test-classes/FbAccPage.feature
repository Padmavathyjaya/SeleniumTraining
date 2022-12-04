Feature: To validate login functionality of gmail application

Scenario: create new account
Given TO launch the  chrome browser and maximise the window 
When launching url
And click the create new account
And pass the firstname in firstname field
 |aishu|padhu|kuzha|
And pass the secondname in  surname field
And pass the email id or mobil num in email field
 |asdf@gmail.com|8874839489|
 |aishu@gmail.com|cbnvn@gmail.com|
 |8908897899|7837482009|
And create the new password in password field 
And check whether navigate to the home page or not of facebook
Then close the chrome  browser