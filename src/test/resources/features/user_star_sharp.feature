#Autor Santiago
@stories
Feature: User use StartSharp page
  As I user of StartSharp page
  need sign in to the page
  for create a business unit
  and new meeting

  Background:
    Given the user is on StartSharp page and sign in
      | user  | password |
      | admin | serenity |

  @scenario1
  Scenario: Create Business Unit
    When fill in the spaces of business unit
      |  name  |   parentUnit   |
      | prueba | administration |
    Then the business unit are created
      | validation |
      |   prueba   |
  @scenario2
  Scenario: Create new meeting
    When fill in the spaces of meetings
      | meetingName | meetingType | meetingNumber |  startDate  |   endDate  | location |      unit      |  organizedBy |   reporter   |
      |   prueba    |   general   |      12       |  10/11/2022 | 10/11/2022 |   hq-01  | administration | aaron taylor | aaron taylor |
    Then the meeting was created
      | validation2 |
      |   prueba    |