Feature: CRM Login Test


#Scenario: Successful CRM Login Test


#Given user is on login crm page
#When title of login page is CRM Software
#Then user enters his crm "sasi08" and "sasirevo"
#Then user clicks on crm login button
#And user in on home page 
#And user closes the browser


Scenario Outline: Successful CRM Login Test


Given user is on login crm page
When title of login page is CRM Software
Then user enters his crm "<username>" and "<password>"
Then user clicks on crm login button
And user in on home page
Then user moves to new contact
And user enters crm contacts "<firstname>" and "<lastname>" and "<position>"
Then user clicks on contacts save button
And user closes the browser

Examples: 
		|username|password|firstname|lastname|position|
		| sasi08 |sasirevo|  Test	| user1	 |	 QA	  |
		| sasi08 |sasirevo|  Devs	| user2	 |	 Dev  |
		
		
		