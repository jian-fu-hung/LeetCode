package MatrixDiagonalSum

class Solution {
    fun runTest() {
        println(diagonalSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))))
        println(
            diagonalSum(
                arrayOf(
                    intArrayOf(1, 1, 1, 1),
                    intArrayOf(1, 1, 1, 1),
                    intArrayOf(1, 1, 1, 1),
                    intArrayOf(1, 1, 1, 1)
                )
            )
        )
    }

    fun diagonalSum(mat: Array<IntArray>): Int {
        var sum = 0
        for (i in mat.indices) {
            if (mat.size - 1 - i == i) {
                sum += mat[i][i]
            } else {
                sum += mat[i][i] + mat[i][mat.size - 1 - i]
            }
        }
        return sum
    }
}