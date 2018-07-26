Feature: Account

@SanityTest
Scenario: Home page default login
	Given User is on NetBanking landing page
	When User logs in to the application with "jin" and "1234"
	Then Home page is populated
	And Cards displayed are "true"