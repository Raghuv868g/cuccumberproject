@tag
Feature: to add  detail

  @tag1
  Scenario:to add customer detail 
    Given user navigte to home page n user click no add customer
    When fill all info
    |f_name|raghu|
    |L_name|varan|
    |mail|raghu@gmail.com|
    |add|green tech|
    |p_no|8220325156|
    And click on the submit button
    Then user validate the result
