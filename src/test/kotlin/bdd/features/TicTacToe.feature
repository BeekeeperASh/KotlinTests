Feature: Tic Tac Toe game

  Scenario: Player X wins
    Given the board is empty
    When player "X" makes a move to ("0", "0")
    And player "O" makes a move to ("1", "0")
    And player "X" makes a move to ("0", "1")
    And player "O" makes a move to ("1", "1")
    And player "X" makes a move to ("0", "2")
    Then player X should be the winner

  Scenario: The game is a draw
    Given the board is empty
    When player "X" makes a move to ("0", "0")
    And player "O" makes a move to ("0", "1")
    And player "X" makes a move to ("0", "2")
    And player "O" makes a move to ("1", "0")
    And player "X" makes a move to ("1", "1")
    And player "O" makes a move to ("2", "2")
    And player "X" makes a move to ("2", "1")
    And player "O" makes a move to ("2", "0")
    And player "X" makes a move to ("1", "2")
    Then the game should be a draw
