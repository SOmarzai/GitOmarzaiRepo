@Regression
Feature: Create Account

  Scenario: Validate Form Title
    Then Click on Create Primary Account Button
    And Validate Account Form Title

    Scenario Outline: Create primary account and validate sign up your account page and email address shows as expected

      When Click on Create Primary Account Button
      When Fill up account form with DataTable
        | email            | random             |
        | firstName        | <firstName>        |
        | lastName         | <lastName>         |
        | prefix           | <prefix>           |
        | gender           | <gender>           |
        | maritalStatus    | <maritalStatus>    |
        | employmentStatus | Student |
        | dob              | <dob>         |
      When Click on Create Account Button
      Then Validate sign up account page title
  Then validate created email
      Examples:
        | firstName | lastName  | gender | maritalStatus | prefix | dob        |
        | Sadiqullah   | Omarzai   | Male | Married       | Mr.   | 01/01/1995 |
        | Juliana   | Martinez   | Female   | Single        | Mrs.     | 11/30/1994 |
        | Masooda  | Ahmad | Female   | Married      | Mrs.    | 10/27/1988 |


  Scenario Outline: Create primary account with existing email validate error message

    When Click on Create Primary Account Button
    When Fill up account form with DataTable
      | email            | <email>             |
      | firstName        | <firstName>        |
      | lastName         | <lastName>         |
      | prefix           | <prefix>           |
      | gender           | <gender>           |
      | maritalStatus    | <maritalStatus>    |
      | employmentStatus | Student |
      | dob              | <dob>         |

    When Click on Create Account Button
    Then Validate error message "ERROR Account with email <email> is exist"
    Examples:
      |email | firstName | lastName  | gender | maritalStatus | prefix | dob        |
      |omarzai64365@tekschool.us| Sadiqullah   | Omarzai   | Male | Married       | Mr.   | 01/01/1995 |
      |Juliana@tekschool.us| Juliana   | Martinez   | Female   | Single        | Mrs.     | 11/30/1994 |
      |masooda@tekschool.us| Masooda  | Ahmad | Female   | Married      | Mrs.    | 10/27/1988 |

