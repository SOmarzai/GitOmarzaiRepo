@Regression
Feature: User Profile

  Scenario: Navigate to login and enter valid CSR credentials and navigate to Customer Service Portal then click on
  profile button validate information is in Profile Side Drawer is correct
    When click on login button
    When enter username "supervisor"
    When enter password "tek_supervisor"
    When click on sign in button
    When click on profile button
    Then validate status "Active" user type "CSR" fullName "Supervisor" username "supervisor" authorities "admin"
    When click on logout button
    Then validate home page title