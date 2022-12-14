@TestToRun
Feature: Confirm whether visa is required to visit UK
#  As a Tourist/Student
#  I want to know if I require Visa to come to the UK from my country.
#  So that I can make a decision before I travel

  Background:
    Given I am on the UKBA website

#  Scenario: Japan nationalities coming to UK to study for more than 6 months require Visa
#    When I provide nationality of "Japan"
#    And I click on the Continue button
#    And I select the reason "Study"
#    And I click on the Continue button
#    And I state I am intending to stay for more than 6 months
#    And I click on the Continue button
#    Then I will be informed "You’ll need a visa to study in the UK"
#
#
#  @scen2
#  Scenario: Japan nationalities coming to UK for Tourism do not require Visa
#    When I provide nationality of "Japan"
#    And I click on the Continue button
#    And I select "tourism" as reason for coming to the UK
#    And I click on the Continue button
#    Then I will be informed "You will not need a visa to come to the UK"
#
#
#  @scen3
#  Scenario Outline: Nationalities coming to UK to study for more than 6 months require Visa using Scenario outline
#    When I provide nationality of "<CountryName>"
#    And I click on the Continue button
#    And I select the reason "Study"
#    And I click on the Continue button
#    And I state I am intending to stay for more than 6 months
#    And I click on the Continue button
#    Then I will be informed "You’ll need a visa to study in the UK"
#    Examples:
#      |CountryName|
#      |Japan      |
#      |Ukraine|
#      |Morocco|
#      |USA|
#      |Australia|
#      |Canada   |

    @scen4
    Scenario: Cuba nationalities coming to UK for Tourism and not travelling or visiting a partner or family require visa
      When I provide nationality of "Cuba"
      And I click on the Continue button
      And I select "tourism" as reason for coming to the UK
      And I click on the Continue button
      And I state I am not travelling or visiting a partner or family
      And I click on the Continue button
      Then I will be informed "You’ll usually need a visa to come to the UK"

  @scen5
  Scenario Outline: Country(B) and Tourism
    When I provide nationality of "<CountryName>"
    And I click on the Continue button
    And I select "tourism" as reason for coming to the UK
    And I click on the Continue button
    And I state I am not travelling or visiting a partner or family
    And I click on the Continue button
    Then I will be informed "You'll need a visa to come to the UK" or "You’ll usually need a visa to come to the UK"
    Examples:
    |CountryName|
    |Russia|
    |Cuba|
    |Belarus|
    |Albania|
    |Hong Kong|
#    |South Korea|


