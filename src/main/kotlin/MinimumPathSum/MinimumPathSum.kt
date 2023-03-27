package MinimumPathSum

class Solution {
    fun runTest() {
//        println(minPathSum(arrayOf(intArrayOf(1, 3, 1), intArrayOf(1, 5, 1), intArrayOf(4, 2, 1))))
//        println(minPathSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))))
        println(minPathSum(arrayOf(intArrayOf(1, 2), intArrayOf(1, 1))))
    }
    fun minPathSum(grid: Array<IntArray>): Int {
        var map = Array(grid.size) { IntArray(size = grid[0].size)}
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                when (i) {
                    0 -> {
                        if (j == 0) {
                            map[0][j] = grid[0][0]
                        } else {
                            map[0][j] = map[0][j-1] + grid[0][j]
                        }
                    }
                    else -> {
                        if(j == 0) {
                            map[i][j] = map[i - 1][j] + grid[i][j]
                        } else {
                            map[i][j] = Math.min(map[i-1][j] + grid[i][j], map[i][j-1] + grid[i][j])
                        }
                    }
                }
            }
        }
        return map[map.size-1][map[0].size-1]
    }
}