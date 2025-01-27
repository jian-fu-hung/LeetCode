package CountPartitionsWithEvenSumDifference

class Solution {

    fun runTest() {
        print(countPartitions(intArrayOf(10, 10, 3, 7, 6)))
    }

    fun countPartitions(nums: IntArray): Int {
        var leftNum = nums[0]
        var rightNum = 0
        var evenCount = 0
        var totalCount = 0
        for (i in 1 until nums.size) {
            rightNum += nums[i]
        }
        for (i in 1 until nums.size) {
            rightNum -= nums[i]
            leftNum += nums[i]
            if (isEven(leftNum - rightNum)) {
                evenCount++
            }

        }
        return evenCount
    }

    private fun isEven(num: Int): Boolean {
        return num%2 == 0
    }
}