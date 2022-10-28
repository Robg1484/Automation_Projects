@AllScenarios @Regression
Feature: Set Background Colors Functionality Validation

Background: 
Given User is on techfios test page
  
  @BGScenario1
  Scenario: 1 User should be able to set background to SkyBlue
    Given Set SkyBlue Background button exists
    When I click on the Set SkyBlue Background button
    Then The background color will change to sky blue
    
  @BGScenario2
  Scenario: 2 User should be able to set background to White
    Given Set White Background exists
    When I click on the Set White Background white button
    Then The background color will change to white

  
    
