#Author: your.email@your.domain.com
#Keywords Summary :
  
  
  
   Feature: Sign Up one 
  @FaceRegression

    Scenario Outline: Signing Up Of One 
    Given user is in Birth Month Home Page
    When user enters "<FirstName>" in the FirstName text box
    And user enters "<LastName>" in The LastName text box
    When user enters "<MobileOrEmail>" in The MobileNumber text box
    And user enters "<NewPassword>" in The NewPassword text box
    Then user closes the Birth Month Page
    
    
    
    Examples: 
      | FirstName | LastName | MobileOrEmail   |     NewPassword   |
      | Aqdas     | WaezJan  | 571 234 7889    | Lorton15288 Grist | 
      | Bakee     |Zahiem Jan| Bakee@gmail.com | 22709United State |
      | Zaheen    | MirJan   | Zaheen@gmail.com| Virginia@)079     |