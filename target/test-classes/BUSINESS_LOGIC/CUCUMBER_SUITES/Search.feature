Feature: Search feature

Background: user is successfully search
When user opens "chrome" browser and exe "C:\\bankingProject\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters url "http://primusbank.qedgetech.com/"
When user enters "Admin" as username
When user enters "Admin" as password
When user clicks on login button

Scenario: Search functionality
When user clicks on "branches"
Then user is on "Branch Details" page and get message as Branch details
When user selects "INDIA" as country
When user selects "Karnataka" as state
When user selects "BANGLORE" as city
When user clicks on "Search" button
Then the Branch details reqested gets displayed