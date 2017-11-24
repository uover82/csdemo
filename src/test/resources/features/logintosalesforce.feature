Feature: log into Salesforce website

  Scenario: Sign in
  # Scenario: Sign in and sign out
    When I open salesforce website
    And I sign into salesforce
    And I view my settings
    And I view my salesforce calendar
    Then I sign out of salesforce
