@getPet
Feature:Get the pets by status
  Scenario:As user I should able to get the pets by status
    When I get a pets that exist in the store by "status"
    Then Response data status code should be 200
    And Response pets status shoud be "name" is "doggie"


