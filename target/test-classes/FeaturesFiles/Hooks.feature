Feature: Free CRM app test

  Scenario: Free crm create deal test
    Given user is on deal page
    When user fills the deal form
    Then deal is created

  Scenario: free crm create contact test
    Given user is on contact page
    When user fills the contact form
    Then contact is created
