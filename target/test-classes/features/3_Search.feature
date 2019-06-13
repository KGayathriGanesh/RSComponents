@Search
Feature: search for required products using Filter options.

  Background:
    Given I launch the "chrome" browser
    When Initiate and set the Driver in BaseClass

  @searchwithFilter_TC3
  Scenario: Search for Aluminium Capacitors of Brand Kemet uing Filters
    Given I launch the RSComponent HomePage URL
    When I verify and click on All products link
    Then I click on Passive Components
    And I Click on Capacitors
    Then I Choose the Aluminium Capacitor
    Then I click on "Brand" to filter
    Then I select "KEMET" Brand
    Then I select Apply filter button

  @searchwithFilter_TC4
  Scenario: Search for Aluminium Capacitors of Brand Kemet uing Filters
    Given I launch the RSComponent HomePage URL
    When I verify and click on All products link
    Then I click on Passive Components
    And I Click on Capacitors
    Then I Choose the Aluminium Capacitor
    Then I click on "Technology" to filter
    Then I select "Hybrid" Brand
    Then I select Apply filter button

  @searchwithFilter_TC5
  Scenario: Search for Aluminium Capacitors of Brand Kemet uing Filters
    Given I launch the RSComponent HomePage URL
    When I verify and click on All products link
    Then I click on Passive Components
    And I Click on Capacitors
    Then I Choose the Aluminium Capacitor
    Then I click on "Polarised" to filter
    Then I select "Polar" Brand
    Then I select Apply filter button

