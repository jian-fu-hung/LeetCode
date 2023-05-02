package SignOfTheProductOfAnArray

class Solution {
    fun arraySign(nums: IntArray): Int {
        var a = 1
        for (num in nums) {
            when {
                num < 0 -> a *= -1
                num == 0 -> return 0
            }
        }
        return a
    }
}