package testing

class TicTacToe {
    private val board: Array<CharArray> = Array(3) { CharArray(3) { ' ' } }
    private var currentPlayer: Char = 'X'

    fun makeMove(row: Int, col: Int): Boolean {
        if (row !in 0..2 || col !in 0..2 || board[row][col] != ' ') {
            return false
        }
        board[row][col] = currentPlayer
        currentPlayer = if (currentPlayer == 'X') 'O' else 'X'
        return true
    }

    fun checkWinner(): Char? {
        for (i in 0..2) {
            if (board[i].all { it == 'X' } || (0..2).all { board[it][i] == 'X' }) {
                return 'X'
            }
            if (board[i].all { it == 'O' } || (0..2).all { board[it][i] == 'O' }) {
                return 'O'
            }
        }
        if ((0..2).all { board[it][it] == 'X' } || (0..2).all { board[it][2 - it] == 'X' }) {
            return 'X'
        }
        if ((0..2).all { board[it][it] == 'O' } || (0..2).all { board[it][2 - it] == 'O' }) {
            return 'O'
        }
        return null
    }

    fun isBoardFull(): Boolean {
        board.forEach {
            if (it.contains(' ')) return false
        }
        return true
    }

    fun resetGame() {
        for (i in 0..2) {
            for (j in 0..2) {
                board[i][j] = ' '
            }
        }
        currentPlayer = 'X'
    }

    fun printBoard(){
        for (i in 0..2) {
            for (j in 0..2) {
                print("${board[i][j]} ")
            }
            println()
        }
        println()
    }

    fun getCurrentPlayer() : Char {
        return currentPlayer
    }

}

fun main() {
    val ticTacToe = TicTacToe()

}