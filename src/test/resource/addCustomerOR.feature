@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario
    Given user  to present in home page
    When fill all info and click submit btn"<f_name>","<l_name>","<email>","<add>","<p_no>"
    Then user validate the outcomes and test the outcome
   	
      Examples:
      
      
      
      | f_name  | l_name |  email  			|   add     |    p_no     |
      | raghu   |  varan | r@gmail.com  |  chennai  | 82203205156  |
      |  raj    |   maan |  v@gmail.com | tamilnadu | 78795515151  |
