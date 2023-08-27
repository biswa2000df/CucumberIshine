Feature: Login Ishine Page

@kanha
  Scenario: Successfully Login with the Valid credential
    Given Open the Chrome Browser
    When Enter the URL "https://mail.apmosys.com/webmail/"
    And Enter the Email as "biswajit.sahoo@apmosys.com" and click on Next button
    When Enter the password as "Welcome@2022"
    And Click on the Login Button
    Then The title is displayed "Inbox [1/396] - BISWAJIT SAHOO (biswajit.sahoo@apmosys.com)"
		
		
	#Scenario: Login with the invalid Credential
		
		#Given Open the Edge Browser
		#When Enter the URL "https://mail.apmosys.com/webmail/"
	#	And Enter the username "" and Enter password ""
		