Feature: Adding numbers
  As a calculator user
  I want to be add numbers
  So that I don't have to do so myself

  Acceptance Criteria
  -------------------
  1. I can add two, three, or four numbers together with the calculator.
  2. Adding negative numbers is handled correctly.

  Scenario Outline: Addition of two numbers
    When I add <one> and <two>
    Then the calculator returns <result>
    Examples:
      | one | two | result |
      | 5 | 7 | 12 |
      | 0 | 0 | 0 |
      | -4 | 23 | 19 |
      | 0 | -11 | -11 |

  Scenario Outline: Addition of three numbers
    When I add <one>, <two>, and <three>
    Then the calculator returns <result>
    Examples:
      | one | two | three | result |
      | 1 | 2 | 3 | 6 |
      | 5 | -2 | 0 | 3 |
      | 0 | 0 | 0 | 0 |
      | 10 | -1 | -6 | 3 |
      | -5 | 1 | 2 | -2 |
      | 1 | -39 | 12 | -26 |

  Scenario Outline: Addition of four numbers
    When I add <one>, <two>, <three>, and <four>
    Then the calculator returns <result>
    Examples:
      | one | two | three | four | result |
      | 1 | 2 | 3 | 4 | 10 |
      | 0 | 0 | 0 | 0 | 0 |
      | 31 | -2 | -5 | -6 | 18 |
      | -1 | -3 | -5 | -7 | -16 |