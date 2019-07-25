
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: to varify the customer id
    Given user navigte to home pag
    And user click non add customer
    When fill all details
    |raghus|varan|raghu@gmail.com|green tech|8220325156|
    And click on submit btn
    Then I validate the outcome
