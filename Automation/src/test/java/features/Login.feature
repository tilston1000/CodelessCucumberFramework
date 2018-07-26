Feature: Login

@WebTest
Scenario: Home page default login
	Given User is on NetBanking landing page
	When User logs in to the application with "jin" and "1234"
	Then Home page is populated
	And Cards displayed are "true"

@MobileTest	
Scenario: Home page default login
	Given User is on NetBanking landing page
	When User logs in to the application with "john" and "4321"
	Then Home page is populated
	And Cards displayed are "false"
	
@MobileTest	
Scenario: Home page default login
	Given User is on NetBanking landing page
	When User logs in to the application with "jin" and "1234"
	Then Home page is populated
	And Cards displayed are "true"	


@SanityTest	
Scenario: Home page default login
	Given User is on NetBanking landing page
	When User signs up with following details
	| jenny | abcd | john@abcd.com | Australia | 324353 |	
	Then Home page is populated
	And Cards displayed are "false"
	
@WebTest
Scenario Outline: Home page default login
	Given User is on NetBanking landing page
	When User logs into the application with <Username> and <Password>
	Then Home page is populated
	And Cards displayed are "true"
Examples:
| Username | Password |
| user1    | pass1    |
| user2    | pass2    |
| user3    | pass3    |
| user4    | pass4    |