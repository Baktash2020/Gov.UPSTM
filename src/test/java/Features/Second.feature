#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.

     Feature: Sign In 
  

    @Regression
    Scenario: Sign In
    Given user is in the Mercury Home Page
    When user enters Username in the textbox
    When user enters Password in mercury textbox
    And user clicks sign in button
    Then user closes Mercury sign in page
     