package MinimumTimeToCollectAllApplesInATree


class Solution {
    fun runTest() {
        minTime(
            n = 7,
            edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 4), intArrayOf(1, 5), intArrayOf(2, 3), intArrayOf(2, 6)),
            hasApple = listOf(false, false, true, false, true, true, false)
        )
    }

    fun minTime(n: Int, edges: Array<IntArray>, hasApple: List<Boolean>): Int {
        var list = Array(n) { mutableListOf<Int>() }
        for (i in 0 until n) {
            list[i] = ArrayList()
        }
        for (i in edges) {
            list[i[0]].add(i[1])
            list[i[1]].add(i[0])
        }
        return dfs(-1, 0, list, hasApple)
    }

    private fun dfs(prev: Int, curr: Int, a: Array<MutableList<Int>>, hasApple: List<Boolean>): Int {
        var ans = 0
        for (x in a[curr]) {
            if (x != prev) {
                val res = dfs(curr, x, a, hasApple)
                if (res > 0 || hasApple[x]) ans += res + 2
            }
        }
        return ans
    }
}