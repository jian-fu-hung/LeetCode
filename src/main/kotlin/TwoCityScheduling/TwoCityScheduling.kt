package TwoCityScheduling

import java.util.*


internal class Solution {
    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        Arrays.sort(costs) { a: IntArray, b: IntArray ->
            a[0] - a[1] - (b[0] - b[1])
        }
        var price = 0
        for (i in 0 until costs.size / 2) {
            price += costs[i][0]
        }
        for (i in costs.size / 2 until costs.size) {
            price += costs[i][1]
        }
        return price
    }
}