Feature: Login
  Scenario Outline: Login to Ndosi Automation Webside
    Given I am on hom page
    And I click login button
    And I enter username <username>
    And I enter password <password>
    When I click submit button
    Then I should be logged in successfully


    Examples:
      | username | password |
      | admin@gmail | @12345678 |
