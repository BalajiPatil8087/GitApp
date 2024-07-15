Feature: Sign-In feature
 Sign feature allow user to login into corresponding github account


@SmokeTest
	Scenario: User is trying access github account using invalid credentials
		Given User is on github loging page
		When  User enter wrong credentials 
		|userName | password |
		|wrongUsername| worngPassword|
		And click on submit
		Then 'Incorrect username or password.' message should display
		
	Scenario: User is trying access github account using valid credentials
		Given User is on github loging page
		When User enter valid credentials 
		|userName | password |
		|GauravTelgu| Gt@250398 |
		And click on submit
		Then user able tpo see home page of corresponding github account