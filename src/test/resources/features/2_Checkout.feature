@Checkout
Feature: This is to setup Test

  Background:
    Given I launch the "chrome" browser
    When Initiate and set the Driver in BaseClass

  @Login
  Scenario: Login to RS components Site and purchase product
    Given I launch the RSComponent HomePage URL
    Then I click on Login Link and Navigate to login page
    And I provide the User Credentials as "kgayathriganesh@gmail.com" and "kgayathriganesh"
    And i click onLogin
    When I verify and click on All products link
    Then I click on Passive Components
    And I Click on Capacitors
    Then I Choose the Aluminium Capacitor
    And I Choose Any one of the Aluminiumn Capacitors
    Then I navigate to Shopping Cart
    And I update the Product quantity
    Then I Click on Checkout Securely button Present on the bottom page

  @Checkout_TC1
  Scenario: Verify user is able to add the products  from home page and able to checkout as Registered User
    Given I launch the RSComponent HomePage URL
    When I verify and click on All products link
    Then I click on Passive Components
    And I Click on Capacitors
    Then I Choose the Aluminium Capacitor
    And I Choose Any one of the Aluminiumn Capacitors
    Then I navigate to Shopping Cart
    And I update the Product quantity
    Then I Click on Checkout Securely button Present on the bottom page
    Then I login with credentials "admin" and "pass1234"
    And I Click on the Login Button

  @Checkout_TC2
  Scenario: Verify user is able to add the products from home page and able to checkout as Registered User
    Given I launch the RSComponent HomePage URL
    When I verify and click on All products link
    Then I click on Passive Components
    And I Click on Capacitors
    Then I Choose the Aluminium Capacitor
    And I Choose Any one of the Aluminiumn Capacitors
    Then I navigate to Shopping Cart
    And I update the Product quantity
    Then I Click on Checkout Securely button Present on the bottom page
    Then I should enter the Email address as "Test@gmail.com"
    And I Click on the Guest Checkout Button