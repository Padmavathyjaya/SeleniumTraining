Feature: To validate login functionality of facebook application

Scenario Outline: validate the positive and negative combination of  login  functionality
 Given TO launch the  chrome browser and maximise the window
 When launch the url
 And  pass the data in "<emaildatas>" in email field
 And pass the data in "<passworddatas>" password field
 And click the login button
 And check whether navigate to the home page or not
 Then close the browser
 
 Examples:
|emaildatas       |passworddatas|
|aishu@gmail.com  |15451        |
|sam@gmail.com    |959589       |
|1234@gmail.com   |gdagds       |