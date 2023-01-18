package MaximumSumCircularSubarray

class Solution {
    fun maxSubarraySumCircular(nums: IntArray): Int {
        var maxSum = nums[0]
        var minSum = nums[0]
        var curMax = 0
        var curMin = 0
        var totalSum = 0
        for (num in nums) {
            curMax = Math.max(curMax + num, num)
            maxSum = Math.max(maxSum, curMax)
            curMin = Math.min(curMin + num, num)
            minSum = Math.min(minSum, curMin)
            totalSum += num
        }
        return if (maxSum > 0) Math.max(maxSum, totalSum - minSum) else maxSum
    }
}