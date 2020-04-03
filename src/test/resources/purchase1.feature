Feature: purchase
  Scenario: purchasing from argos
    Given I am on home page
    When I entred product name "puma"
    Then I click search button
    Then I selected price range "£15 - £20"
    Then I selected customer rating "4or more"
    Then I have selected the desired item
    Then I entered my postcode "TW3 3ST"
    Then I selected the quantity "2"
    Then I clicked on add to the trolley button
    Then I clicked go to the trolley button
    Then I checked the total price
    Then I have checked per unit price
