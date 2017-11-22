Feature: log into Saba website

  Scenario: Sign in
  # Scenario: Sign in and sign out
    When I open saba website
    And I sign into saba
    And I search for a course
    And I view my saba calendar
    Then I sign out of saba
