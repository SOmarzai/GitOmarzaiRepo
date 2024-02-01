@Regression
Feature: Testing CSR Primary Account Section
  Background: Login with CSR Credentials
    When click on login button
    When enter username "supervisor"
    When enter password "tek_supervisor"
    When click on sign in button
    When click on account link


    Scenario: Navigate to Customer Service Portal with valid CSR credentials and navigate to Accounts verify 5 row
    /page is default

      Then validate card title to be "Primary Accounts"
      Then validate table row count to be 5

      Scenario: Navigate to Customer Service Portal with valid CSR credentials and navigate to Accounts change show
      per page to 10, 25, 50 and validate table records per page according to selected show per page.

        When change items per page to "10"
        Then validate table row count to be 10
        When change items per page to "25"
        Then validate table row count to be 25
        When change items per page to "50"
        Then validate table row count to be 50

