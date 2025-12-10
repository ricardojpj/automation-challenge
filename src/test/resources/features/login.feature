Feature: Login Functionality
  As a user of Quotes to Scrape
  I want to login with valid credentials
  So that I can access restricted content

  @severity=critical
  Scenario: Successful login with admin credentials
    Given I am on the Quotes to Scrape login page
    When I enter username "admin" and password "admin"
    And I click the login button
    Then I should see the "Logout" option