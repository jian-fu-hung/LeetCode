package KidsWithTheGreatestNumberOfCandies

class Solution {
    fun runTest() {
        println(kidsWithCandies(intArrayOf(2,3,5,1,3), 3))
        println(kidsWithCandies(intArrayOf(4,2,1,1,2), 2))
    }
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var returnList = mutableListOf<Boolean>()
        var max = candies[0]
        for(i in candies) {
            if (i > max) {
                max = i
            }
        }

        for(i in candies.indices) {
            if(candies[i] + extraCandies >= max) {
                returnList.add(true)
            } else {
                returnList.add(false)
            }
        }

        return returnList
    }
}