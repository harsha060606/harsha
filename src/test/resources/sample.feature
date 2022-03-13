Feature: sample steps for sutuations

  Scenario: Sutuation 1
    Given I have 1 cucumber in my belly

  Scenario: sutuation 2
    Given I have "42" cucumbers in my belly

  Scenario: sutuation 3
    Given i have 1 cucumber in my belly
    Given i have 42 cucumbers in my belly

  Scenario: 4
    Given i have 2 cucumber in my bellys
    Given i have 43 cucumbers in my stomaches

  Scenario Outline: 5
    Given display value <x>

    Examples: 
      | x  |
      |  2 |
      | 27 |
      | 23 |
      | 67 |

  Scenario: 6
    Given my name is peter man

  Scenario: 7
    Given i have 1{what} in my belly (amazing!)

  Scenario: 8
    Given i have 3\{what} in my belly \(amazing!)

  Scenario: 9
    Given my mobile number "9901234567"

  Scenario Outline: 
    Given send mail to "<mail>" as subject as "<subject>" and body as
      """
      hi
      my name is sososso
      good morning
      byr goodnight
      """

    Examples: 
      | mail      | subject |
      | jnma.com  | hi      |
      | haja.com  | bye     |
      | kakka.com | great   |
