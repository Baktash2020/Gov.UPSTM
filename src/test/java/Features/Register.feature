#Author: your.email@your.domain.com
#Keywords Summary :


   Feature: Register Page
   
   @Regression 
  Scenario Outline: Register Page
    Given user is in the Mercury HomePage
    When user enters "<FirstName>" in first name text box
    And user enters "<LastName>" in last name text box
    And user enters "<Phone>" in phone no text box
    And user enters "<Email>" in Email text box
    When user enters "<Address1>" in address1 text box
    And user enters "<Address2>" in address2 text box
    When user enters "<City>" in city text box
    And user enters "<State/Province>" in state text box
    When user enters "<PostalCode>" in postalcode text box
    When user enters "<Country>" in country text box 
    When user enters User Name
    And user enters PassWord
    And user confirms passWord
    When user clicks Submit
    Then user close Register Page

    Examples: 
      | FirstName | LastName | Phone    |  Email           | Address | Address1    |   City    | State/Province |PostalCode| Country      |
      | Aqdas     |    Jan   | 57123489 | Aqdas@gmail.com  | Lorton  | 15288 Grist |  Lorton   |  Virginia      |   22191  | United State | 
      | Bakee     |    Jan   | 57123489 | Bakee@gmail.com  | Lorton  | 15288 Grist |Woodbridge |  Virginia      |   22709  | United State |
      | Zaheen    |    Jan   | 57134098 | Zaheen@gmail.com | Lorton  |9222 Treasure|   Lorton  |  Virginia      |   22079  | United State |
      
      
 