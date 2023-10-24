@Register
Feature: Register
  As a user
  I want to register
  So that I can register my account

  @SuccessToRegister
  Scenario: Success To Register
    Given Account is not registered
    Given Login page opened
    When I click no account yet create one
    And I input name "Andi"
    And I input email "andi@fakemail.com"
    And I input password "password"
    And I input confirm password "password"
    And I click register
    Then Success to register
    Then Show alert registration successful