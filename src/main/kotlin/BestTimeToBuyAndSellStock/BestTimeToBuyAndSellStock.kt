package BestTimeToBuyAndSellStock


class Solution {

    fun runTest() {
        println(maxProfit(intArrayOf(7,1,5,3,6,4)))
    }

    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0

        var max = 0
        var min = prices[0]

        for (i in 1 until prices.size) {
            max = maxOf(max, prices[i] - min)
            min = min.coerceAtMost(prices[i])
        }
        return max
    }

}