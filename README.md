RSComponents Demo:

Demo on Cucumber Selenium with Java

It is a maven Project once you cloned the project please open that in Intelij or eclipse

Running the Tests:

  Option:1
    1. Clone the Project
    2. Navigate to Project folder in command line
    3. Type "mvn test"

  Option:2
    1. open the project in IDE
    2. Go to "RSComponents\src\test\java\com\bedifrent\RunTest.java"
    3. Right click on the file and select "Run"

  Scenarios Covered:
    TestCase1(TC1): Login to RS components Site with registered user, select the product and proceed to checkout.
    TestCase2(TC2): Launch RS components site and navigate to select the product from home page and able to checkout as Registered UserT
    TestCase3(TC3): Launch RS components site and navigate to select the product from home page and able to checkout as Guest User:
    TestCase4(TC4): Search for Aluminium Capacitors of Brand Kemet uing Filters
    TestCase5(TC5): Search for Aluminium Capacitors of Brand Technology uing Filters
    TestCase6(TC6): Search for Aluminium Capacitors of Brand Polarised uing Filters

    Additional scenario to check for homepage:
    To ensure Home page has launched and verify all the pages are displayed.

 Configuration:
  Currently is set to run on Chrome Browser for each features file
  if you wish to run on firefox or IE please change in feature file and run.


 Logs and Report:
   1. Report of Test exectuion and logs are logged in the same file "RSComponents\target\reports\ExtentReports.html"
   2. Please open the html in chrome browser from the above location to see the complete test execution report
   3. clicking on the last icon in the report gives the TestRunner Logs.
