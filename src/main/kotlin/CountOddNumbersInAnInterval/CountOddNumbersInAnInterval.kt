package CountOddNumbersInAnInterval

class Solution {
    fun runTest() {
        println(countOdds(3, 7))
        println(countOdds(8, 10))
    }
    fun countOdds(low: Int, high: Int): Int {
        var returnCount = 0
        for(i in low..high) {
            if(i%2 != 0) {
                returnCount++
            }
        }
        return returnCount
    }
}