package MaximumNumberOfFishInAGrid

class Solution {
    fun runTest() {
        println(
            findMaxFish(arrayOf(
                intArrayOf(0,2,1,0),
                intArrayOf(4,0,0,3),
                intArrayOf(1,0,0,4),
                intArrayOf(0,3,2,0)
            ))
        )
        println(
            findMaxFish(arrayOf(
                intArrayOf(0,0,0,0),
                intArrayOf(0,0,0,0),
                intArrayOf(0,0,0,0),
                intArrayOf(0,0,0,0)
            ))
        )
        println(
            findMaxFish(arrayOf(
                intArrayOf(0,5),
                intArrayOf(8,4),
            ))
        )
        println(
            findMaxFish(arrayOf(
                intArrayOf(8,6),
                intArrayOf(2,6),
            ))
        )
    }

    fun findMaxFish(grid: Array<IntArray>): Int {
        var returnMax = 0
        val isVisited = Array(grid.size) {
            BooleanArray(
                grid[0].size
            )
        }
        for (i in grid.indices) {
            for (j in 0 until grid[i].size) {
                val currMax = countMax(isVisited, grid, i, j)
                returnMax = Math.max(returnMax, currMax)
            }
        }
        return returnMax
    }

    fun countMax(isVisited: Array<BooleanArray>, data: Array<IntArray>, row: Int, col: Int): Int {
        if (
            row < 0 || row >= data.size ||
            col < 0 || col >= data[0].size ||
            data[row][col] == 0 ||
            isVisited[row][col]
        ) {
            return 0
        }
        isVisited[row][col] = true
        val topMax = countMax(isVisited, data, row - 1, col)
        val rightMax = countMax(isVisited, data, row, col + 1)
        val bottomMax = countMax(isVisited, data, row + 1, col)
        val leftMax = countMax(isVisited, data, row, col - 1)

        return data[row][col] + topMax + bottomMax + rightMax + leftMax
    }
}