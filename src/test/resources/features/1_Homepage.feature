@Setup
Feature: Navigate all the Main Menu in RS Components Site

  Background:
    Given I launch the "chrome" browser
    When Initiate and set the Driver in BaseClass

  @HomePage
  Scenario Outline: Verify "<link>" is displayed on banner in the HomePage
    Given I launch the RSComponent HomePage URL
    Then "<link>" should be displayed
    Examples:
      | link |
      | All Products |
      | Our Brands |
      | New Products |
      | My Account |
      | Our Services |