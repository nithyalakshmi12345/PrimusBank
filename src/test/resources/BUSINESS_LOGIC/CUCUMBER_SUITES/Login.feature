Feature: Login feature

Background: user is successfully logged in
When user opens "chrome" browser and exe "C:\\bankingProject\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters url "http://primusbank.qedgetech.com/"

Scenario: Login functionality for valid username and valid password
When user enters "Admin" as username
When user enters "Admin" as password
When user clicks on login button
Then user is on "Admin" main page and get message as Welcome to Admin