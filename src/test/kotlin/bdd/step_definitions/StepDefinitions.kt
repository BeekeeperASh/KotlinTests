package bdd.step_definitions
import io.cucumber.java.en.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import testing.TicTacToe


class StepDefinitions {
    private val game = TicTacToe()

    @Given("the board is empty")
    fun givenTheBoardIsEmpty() {
        game.resetGame()
    }

    @When("player {string} makes a move to \\({string}, {string}\\)")
    fun whenPlayerMakesAMove(player: String, row: String, col: String) {
        game.makeMove(row.toInt(), col.toInt())
    }

    @Then("player X should be the winner")
    fun thenPlayerXShouldBeTheWinner() {
        assertEquals('X', game.checkWinner())
    }

    @Then("the game should be a draw")
    fun thenTheGameShouldBeADraw() {
        assertTrue(game.isBoardFull())
        assertEquals(null, game.checkWinner())
    }
}
