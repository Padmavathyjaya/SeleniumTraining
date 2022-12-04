@Feature2
Feature: validate the login funcationality of amazon

@Regression
Scenario: create new account
Given TO launch the  chrome browser and maximise the window 
When launching  url
And click the signin option
And pass the email id or mobil num in email field
 |asdf@gmail.com|8874839489|
 |aishu@gmail.com|cbnvn@gmail.com|
 |8908897899|7837482009|
And click the continue button
And create the new password in password field
|aishu|padhu|kuzha| 
And check whether navigate to the home page or not of facebook
Then close the chrome  browser

@Smoke
Scenario: create new account for amazon
Given launch the  chrome browser and maximise the window
When launch the amazon url
And click the signin option in homepage
 
 #One dimensional map data
And TO pass the email id or mobil num in email field 
 #key      value
 |fstname |qweert@gmail.com |
 |sndname |abc@gmail.com|
 |thrdname|kuzhal@gmail.com|
And TO click the continue button
  #Two dimensional map data
And To pass the new password in password field
 |email1          |email2       |
 |qweert@gmail.com|8966554987   |
 |6789564389      |abc@gmail.com|
 |bnmbj@gmail.com |66776555787  |
And Check the  whether navigate to the  facebook home page or not
Then close chrome browser