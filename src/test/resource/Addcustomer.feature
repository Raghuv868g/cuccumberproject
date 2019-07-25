@tag
Feature: to add  detail

  @tag1
  Scenario:to add customer detail 
    Given user navigte to home page
    And user click no add customer
    When fill all detail
    |raghu|varan|raghu@gmail.com|green tech|8220325156|
    And click on submit button
    Then I validate the outcomes
