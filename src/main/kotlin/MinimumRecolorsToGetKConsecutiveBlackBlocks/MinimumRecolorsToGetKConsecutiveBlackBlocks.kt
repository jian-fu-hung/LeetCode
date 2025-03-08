package MinimumRecolorsToGetKConsecutiveBlackBlocks

class Solution {
    fun runTest() {
        println(minimumRecolors("WWB", 2))
        println(minimumRecolors("WBWBBBW", 2))
    }
    fun minimumRecolors(blocks: String, k: Int): Int {
        if (blocks.length < k) {
            return 0
        }
        var nowBlock = 0
        var nowCount = 0
        var minCount = Int.MAX_VALUE
        for (i in 0 until k) {
            if (blocks[i] == 'W') {
                nowCount++
            } else {
                nowBlock++
            }
            if (i == (k - 1)) {
                minCount = Math.min(minCount, nowCount)
            }
        }
        if (blocks.length - 1 < k) {
            return minCount
        }
        for (i in 1 .. (blocks.length - k)) {
            if (blocks[i -1] == 'W') {
                if (nowCount != 0) {
                    nowCount--
                }
            } else {
                if (nowBlock != 0) {
                    nowBlock--
                }
            }
            if (blocks[i+k-1] == 'W') {
                nowCount++
            } else {
                nowBlock++
            }
            minCount = Math.min(minCount, nowCount)
        }
        return minCount
    }
}