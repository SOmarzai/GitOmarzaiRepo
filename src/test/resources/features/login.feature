@Smoke @Regression
Feature: Login to Tek Insurance Application

  Background: Setup steps
    Then validate login button is available
    When click on login button
    Then validate sign in form title

  Scenario: Positive Test. login to tek insurance application with valid credentials
    When enter username "supervisor"
    When enter password "tek_supervisor"
    When click on sign in button
    Then validate customer service portal title

    Scenario Outline: Negative Test. login to tek insurance application with wrong username and valid password

      When enter username "<username>" and "<password>"
      When click on sign in button
      Then validate error message "<errorMessage>"
      Examples:
      |username|password|errorMessage|
      |wrong   |tek_supervisor|ERROR User wrong not found|
      |supervisor|Wrong@123       |ERROR Password not matched|
