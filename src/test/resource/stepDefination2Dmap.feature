
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given user should be  homepage
    When user to click submit btn and fill the detail
     |F_nmae|L_name|  Add   |       Mail   |phone|
     |raghu|     v | chennai|   r@gmail.com|54154152|
     |raj|       a |  tirchy|  rv@gmail.com|5684565|
     |rex|      d  |  Delhi | rj@gmail.com |7485458414|
     |loki|     x  |  greeen|rhhv@gmail.com|96854120|
    And user to click sub button and wait for next page login
      Then user verify the result