# BankAccountApp
-Read a .csv file of names, social security number, account type and initial deposit
-Use a proper data structure to hold all these accounts
-Both savings and checking account share the following properties:
 	deposit(), withdraw(), transfer(), showInfo()
-11 digit Account number(generated with the following process:
1 or 2 depending on Savings or Checking, last two digits of SSN, unique 5- digit number and random 3-digit number)
-Savings account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code
-Checking Account holders are assigned a Debit Card with a 12-digit number and a 4-digit PIN
-Both accounts will use an Interface that determines the base interest rate
	Savings accounts will use 0.25 points less than the base rate
	Checking account will use 15% of the base rate
-The showInfo() method should reveal relevant account information as well as information specific to the Checking account or Savings account
