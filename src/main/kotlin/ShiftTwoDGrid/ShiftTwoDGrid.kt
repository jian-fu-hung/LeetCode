package ShiftTwoDGrid

class Solution {
    fun shiftGrid(grid: Array<IntArray>, k: Int): List<List<Int>> {
        val m = grid[0].size
        val n = grid.size
        val total = n * m
        val k = k%total

        var newGrid = ArrayList<List<Int>>()
        for(i in 0..n-1){
            val newIntArray = ArrayList<Int>()
            for(j in 0..m-1){
                val index = (((i * m) + j) - k + total ) % total
                newIntArray.add(grid[index/m][index%m])
            }
            newGrid.add(newIntArray.toList())
        }


        return newGrid.toList()
    }
}