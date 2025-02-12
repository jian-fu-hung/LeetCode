package MaxSumOfAPairWithEqualSumOfDigits

class Solution {
    fun runTest() {
        println(maximumSum(intArrayOf(18,43,36,13,7)))
        println(maximumSum(intArrayOf(10,12,19,14)))
    }
    fun maximumSum(nums: IntArray): Int {
        val countMap = mutableMapOf<Int, Int>()
        var maxNum = -1
        for (i in 0 until nums.size) {
            val count = getNum(nums[i])
            if (countMap[count] == null) {
                countMap[count] = nums[i]
            } else {
                maxNum = Math.max((countMap[count] ?: 0) + nums[i], maxNum)
                countMap[count] = Math.max(countMap[count] ?: 0, nums[i])
            }
        }
        return maxNum
    }

    fun getNum(num: Int): Int {
        var a = num
        var count = 0
        while (a >= 10) {
            count += (a % 10)
            a /= 10
        }
        return count + a
    }
}