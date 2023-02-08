package JumpGameII

class Solution {
    fun runTest() {
        println(jump(intArrayOf(2,3,1,1,4)))
    }
    fun jump(nums: IntArray): Int {
        var ans = 0
        var currEnd = 0
        var currFarthest = 0

        for(i in 0 until nums.size-1) {
            currFarthest = Math.max(currFarthest, i+nums[i])
            if(i == currEnd) {
                ans++
                currEnd = currFarthest
            }
        }
        return ans
    }
}