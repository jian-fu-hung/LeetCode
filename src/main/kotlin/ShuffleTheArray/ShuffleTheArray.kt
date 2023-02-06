package ShuffleTheArray

class Solution {

    fun runTest() {
        println(shuffle(intArrayOf(2,5,1,3,4,7), 3))
        println(shuffle(intArrayOf(1,2,3,4,4,3,2,1), 4))
        println(shuffle(intArrayOf(1,1,2,2), 2))
    }

    fun shuffle(nums: IntArray, n: Int): IntArray {
        var returnArray = arrayListOf<Int>()
        for(i in 0 until n) {
            returnArray.add(nums[i])
            returnArray.add(nums[i+n])
        }

        return returnArray.toIntArray()
    }
}