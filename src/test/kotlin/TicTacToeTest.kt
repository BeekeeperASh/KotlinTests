import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import testing.TicTacToe

class TicTacToeTest {

    private lateinit var game: TicTacToe

    @BeforeEach
    fun setUp() {
        game = TicTacToe()
    }

    @Test
    fun `should initialize an empty board`() {
        assertEquals(null, game.checkWinner())
        assertFalse(game.isBoardFull())
    }

    @Test
    fun `should allow player X to make a valid move`() {
        val result = game.makeMove(0, 0)
        assertTrue(result)
        assertEquals(null, game.checkWinner())
    }

    @Test
    fun `should not allow move on an already occupied cell`() {
        game.makeMove(0, 0) // Player X
        val result = game.makeMove(0, 0) // Attempt to occupy the same cell
        assertFalse(result)
    }

    @Test
    fun `should alternate players after moves`() {
        assertTrue(game.getCurrentPlayer() == 'X')
        game.makeMove(0, 0) // Player X
        assertTrue(game.getCurrentPlayer() == 'O')
        game.makeMove(1, 0) // Player O
    }

    @Test
    fun `should declare player X as the winner`() {
        game.makeMove(0, 0) // X
        game.makeMove(1, 0) // O
        game.makeMove(0, 1) // X
        game.makeMove(1, 1) // O
        game.makeMove(0, 2) // X wins
        assertEquals('X', game.checkWinner())
    }

    @Test
    fun `should declare player O as the winner`() {
        game.makeMove(1, 0) // X
        game.makeMove(0, 0) // O
        game.makeMove(0, 1) // X
        game.makeMove(1, 1) // O
        game.makeMove(2, 1) // X
        game.makeMove(2, 2) // O wins
        assertEquals('O', game.checkWinner())
    }

    @Test
    fun `should detect a draw`() {
        game.makeMove(0, 0) // X
        game.printBoard()
        game.makeMove(0, 1) // O
        game.printBoard()
        game.makeMove(0, 2) // X
        game.printBoard()
        game.makeMove(1, 0) // O
        game.printBoard()
        game.makeMove(1, 1) // X
        game.printBoard()
        game.makeMove(2, 2) // O
        game.printBoard()
        game.makeMove(2, 1) // X
        game.printBoard()
        game.makeMove(2, 0) // O
        game.printBoard()
        game.makeMove(1, 2) // X - all cells filled
        game.printBoard()
        assertTrue(game.isBoardFull())
        assertEquals(null, game.checkWinner()) // No winner
    }

    @Test
    fun `should reset the game`() {
        game.makeMove(0, 0)
        game.resetGame()
        assertEquals(null, game.checkWinner())
        assertFalse(game.isBoardFull())
    }
}
