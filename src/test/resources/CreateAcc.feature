@Feature1
Feature: To validate login functionality of gmail application

@Sanity
Scenario: create new account for facebook
Given TO launch the  chrome browser and maximise the window
When launch the facebook url
And click the create new account for facebook account
 
#One dimensional map data
And pass the firstname in firstname field of fb page 
 #key      value
 |fstname |aishu |
 |sndname |padhu |
 |thrdname|kuzhal|
And pass the surname in  surname field
 
 #Two dimensional map data
And pass the email id or mobil num in email field of fb page
 |email1          |email2       |
 |qweert@gmail.com|8966554987   |
 |6789564389      |abc@gmail.com|
 |bnmbj@gmail.com |66776555787  |
 
And create the new password in password field 
And check the  whether navigate to the  facebook home page or not
Then close the chrome browser
 