@Regression
Feature: Validate Plans

  Background: Login with CSR Credentials

    When click on login button
    When enter username "supervisor"
    When enter password "tek_supervisor"
    When click on sign in button
    When click on plans link

  Scenario: Navigate to Customer Service Portal with valid CSR credentials and navigate to Plans Page. Validate 4
  row of data is present.

    Then validate table row count to be 4
 @FR_1
    Scenario: Navigate to Customer Service Portal with valid CSR credentials and navigate to Plans Page. Then validate
    Create Date is today's date in (EST Time zone) and Date Expire is a day after (EST Time Zone)

      Then validate create date is today's date EST Time Zone
      Then validate expire date is day after EST Time Zone