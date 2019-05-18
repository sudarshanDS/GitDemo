Feature: Application Login

Scenario: positive test validation testing
Given initialize the browser with chrome
When Login to the "http://qaclickacademy.com" site
And click on the Login button
And Enter the "sudar99" and "123456" in the loginpage
Then verify the user is successfully login

