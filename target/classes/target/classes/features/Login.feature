Feature: Application Login

Scenario: Home page default Login
Given Login in Landing page
When username and password is "Ram" and "Sam" displayed
Then Home page is populated
And Cards are displayed

Scenario: Home page false Login
Given Login in Landing page
When username and password is "vig" and "234" displayed
Then Home page is populated
And Cards are not displayed