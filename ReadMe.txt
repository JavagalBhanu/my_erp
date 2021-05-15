1. Regression Test Cases will be provided by Manual Testing Team
2. Automation Team is resposible to convert MTC in ATS
3. Secario 1 -valid login
precondition: Login Page of actiTIME
Steps:
1. enter valid username
2. enter valid password
3. click on login
4. verify that Home page is displayed
How to Automate?
1. Execute Test Case Manually-Understand the test case - to get more clarity
(test case may not be in details, old test case.....)
Note: Manual Team should give test data

2. while executing the Test Case note down
   1. Page 
   2. element 
   3. action
1. enter valid username
   page:        element        action
   LoginPage    username	enter

2. enter valid password
   page:        element        action
   LoginPage	password	enter

3. click on login
   page:        element        action
   LoginPage    loginbutton	click

4. verify that Home page is displayed
   page:        element        action
   HomePage	title		verify page is dispalyed or not


After noting down the details create a POM class for each page under 'pages' packages
add respective elements and actions(method) into the POM class
 A. declaration		@FindBy
 B. initialization	PF.ie....
 C. utilization		getter /setter methods	

To handle common method use inheritance .i.e create BasePage class and extend it by
all the pom class

Process to develop Test Class
1. Number of Test Class should be same as number of manual Test cases
2. Test Class should be created under script package with name same as
manual testcase id/name
3. every test class should extended BaseTest class
4. Test Class should contain Test Method
5. Inside test method specify test case steps as comment
6. for each step call respective pom class method
7. take the required input from excel file
----------------------------------Test Case 2----------------------------------
1. enter invalid user name
2. enter invalid password
3. click login
4. verify err msg is dispalyed
Execute Test Case manually and note down page,elements & actions
loginpage un enter
loginpage pw enter
loginpage login click
loginpage  errmsg verifyDisplayed











