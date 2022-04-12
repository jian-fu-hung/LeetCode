package GameOfLife

class Solution {
    fun gameOfLife(board: Array<IntArray>): Unit {
        val n: Int = board.size
        val m: Int = board[0].size
        val prev = Array(n) { IntArray(m) }
        for (i in 0 until n) {
            for (j in 0 until m) {
                prev[i][j] = board[i][j]
            }
        }
        val population_count = Array(n) { IntArray(m) }
        for (i in 0 until n) {
            for (j in 0 until m) {
                var count = 0
                if (i - 1 >= 0 && j - 1 >= 0 && i - 1 < n && j - 1 < m) count += board[i - 1][j - 1]
                if (i - 1 >= 0 && j >= 0 && i - 1 < n && j < m) count += board[i - 1][j]
                if (i - 1 >= 0 && j + 1 >= 0 && i - 1 < n && j + 1 < m) count += board[i - 1][j + 1]
                if (i >= 0 && j - 1 >= 0 && i < n && j - 1 < m) count += board[i][j - 1]
                if (i >= 0 && j + 1 >= 0 && i < n && j + 1 < m) count += board[i][j + 1]
                if (i + 1 >= 0 && j - 1 >= 0 && i + 1 < n && j - 1 < m) count += board[i + 1][j - 1]
                if (i + 1 >= 0 && j >= 0 && i + 1 < n && j < m) count += board[i + 1][j]
                if (i + 1 >= 0 && j + 1 >= 0 && i + 1 < n && j + 1 < m) count += board[i + 1][j + 1]
                population_count[i][j] = count
            }
        }
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (prev[i][j] == 1) {
                    if (population_count[i][j] < 2) {
                        board[i][j] = 0
                    } else if (population_count[i][j] > 3) {
                        board[i][j] = 0
                    }
                } else {
                    if (population_count[i][j] == 3) {
                        board[i][j] = 1
                    }
                }
            }
        }

    }

}