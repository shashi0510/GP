Feature: CRM new deals

Scenario: Adding new deals

Given user in on crm login page
When title of login page is CRM Software
Then user enters crm username and password
|	sasi08	|	sasirevo	|
And user clicks on page login button
Then user is directed to home page
And user moves to new deals
And user enters new deal details
| abc | 1000 | 50 | 20 |
And user close the browser