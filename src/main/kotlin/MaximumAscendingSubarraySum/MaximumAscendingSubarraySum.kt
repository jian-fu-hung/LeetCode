package MaximumAscendingSubarraySum

class Solution {
    fun runTest() {
        println(maxAscendingSum(intArrayOf(5,5,6,6,6,9,1,2)))
        println(maxAscendingSum(intArrayOf(10,20,30,5,10,50)))
        println(maxAscendingSum(intArrayOf(10,20,30,40,50)))
        println(maxAscendingSum(intArrayOf(12,17,15,13,10,11,12)))
        println(maxAscendingSum(intArrayOf(17,15)))
        println(maxAscendingSum(intArrayOf(15,17)))
    }
    fun maxAscendingSum(nums: IntArray): Int {
        if (nums.size < 2) return nums[0]
        var max = 0
        var currMax = nums[0]
        for (i in 0 until nums.size - 1 ) {
            if (nums[i] < nums[i+1]) {
              currMax+=nums[i+1]
            } else if (nums[i] >= nums[i+1]) {
                if (max == 0) {
                    max = currMax
                } else {
                    max = Math.max(max, currMax)
                }
                currMax = nums[i+1]
            }
        }
        max = Math.max(max, currMax)
        return max
    }
}